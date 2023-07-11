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

PV = "0.11.4"

RPM_NAME = "speech-dispatcher-module-espeak-0.11.4-2.1.aarch64.rpm"
RPM_HASH = "02721c2005d5ca7f6fe4e5d11b30dca848e196c34c0d832b45231dd09cd28b3ad15131d6b9f1f0d495e4de0a1dce95dfdc3e3108c370bfdd99c07229d4216ad1"

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
