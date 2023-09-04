SUMMARY = "Device independent layer for speech synthesis - Client library"
DESCRIPTION = "The goal of Speech Dispatcher project is to provide a high-level device \
independent layer for speech synthesis through a simple, stable and \
well documented interface. \
 \
What is a very high level GUI library to graphics, Speech Dispatcher is \
to speech synthesis. The application neither needs to talk to the \
devices directly nor to handle concurrent access, sound output and other \
tricky aspects of the speech subsystem."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.5"

RPM_NAME = "libspeechd2-0.11.5-1.1.aarch64.rpm"
RPM_HASH = "5bf9e0f967b1cca702a95b76644f25d37816b804b4505f2da26a2616e2e79157d95b1511766ed7b67cbb5fde5eece19613d7bed80786ec29371f6e456b48ecfb"

RPROVIDES:${PN} += "libspeechd.so.2 \
libspeechd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
