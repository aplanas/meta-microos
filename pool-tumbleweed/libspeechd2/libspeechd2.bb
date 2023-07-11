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

PV = "0.11.4"

RPM_NAME = "libspeechd2-0.11.4-2.1.aarch64.rpm"
RPM_HASH = "e10d98fbab49606d9d4f7955c19803aa00ebbf49f59e08ad7bceb5a482d61da873fbe6290bc339fe1472f6eff33f38632c47f6ae008ba735beaab4d888ee5c1f"

RPROVIDES:${PN} += "libspeechd.so.2 \
libspeechd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
