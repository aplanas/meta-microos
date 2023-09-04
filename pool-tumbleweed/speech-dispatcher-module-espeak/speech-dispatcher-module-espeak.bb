SUMMARY = "ESpeak module for Speech Dispatcher"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem. \
 \
This package contains the espeak module."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.11.5"

RPM_NAME = "speech-dispatcher-module-espeak-0.11.5-1.1.aarch64.rpm"
RPM_HASH = "f3b7b7ad1d0f0c84c691829b53f922430093904ff17403c5a252d3d88c5ce8f2468ee0cd4c004ac8e92e7228585a246cdc8366fbaddb06bc4ead7ca343edfe03"

RPROVIDES:${PN} += "config-speech-dispatcher-module-espeak \
speech-dispatcher-module-espeak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdotconf.so.0 \
libespeak-ng.so.1 \
libglib-2.0.so.0 \
libltdl.so.7 \
speech-dispatcher"

inherit rpm
