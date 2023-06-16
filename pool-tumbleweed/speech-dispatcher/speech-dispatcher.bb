SUMMARY = "Device independent layer for speech synthesis"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.11.4"

RPM_NAME = "speech-dispatcher-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "0f166498505feef1680e674c560b86865c08b621be6e7285bcbab599c3e6296e10ab2e3f97cf0ae789d41c34b69644974eaf794897b4debf2935e0ce7f422fb7"

RPROVIDES:${PN} += "config-speech-dispatcher \
speech-dispatcher \
speechd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libao.so.4 \
libasound.so.2 \
libc.so.6 \
libdotconf.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libltdl.so.7 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libspeechd.so.2 \
python3-speechd"

inherit rpm
