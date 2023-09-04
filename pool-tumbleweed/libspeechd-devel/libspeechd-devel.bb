SUMMARY = "Device independent layer for speech synthesis - Development files"
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

RPM_NAME = "libspeechd-devel-0.11.5-1.1.aarch64.rpm"
RPM_HASH = "9e4cab06956f6ba4afc15cc1fc07192ee7b0474d1c35e26dd19d1d4d0c45a5879dd7330744c330d308d2c5ce2760398189238d4893a9c03c63f8aa1b20d5f37f"

RPROVIDES:${PN} += "libspeechd-devel \
pkgconfig-speech-dispatcher \
speech-dispatcher-devel \
speechd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeechd2 \
pkgconfig-glib-2.0"

inherit rpm
