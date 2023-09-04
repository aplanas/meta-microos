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

PV = "0.11.5"

RPM_NAME = "speech-dispatcher-0.11.5-1.1.aarch64.rpm"
RPM_HASH = "faf038e50d4f59ca58f7e9ffde61476f1b14628958d40cfef31ee4c0a48b4b86349b16ed6f3300b41c157bfe798d6b07e2df971eb8a387dbb25a38a1fe247abf"

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
