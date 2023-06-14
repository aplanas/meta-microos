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

RPM_NAME = "speech-dispatcher-module-espeak-0.11.4-1.3.aarch64.rpm"
RPM_HASH = "3eb9d11589cdb2d86f12ad2f8ddbcdb9df046bf3ead2f5abb0ddab19927a9840bc2b1c2fb87ddfad92f41098c73ad7592712edecdb1dabcbfc2557e76b44327a"

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
