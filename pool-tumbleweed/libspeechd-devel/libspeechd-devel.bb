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

PV = "0.11.4"

RPM_NAME = "libspeechd-devel-0.11.4-2.1.aarch64.rpm"
RPM_HASH = "4d9a3ac4aa20cf022e48b265946d0498c299f55c78e1e69ab94cc129d7cb0a16a0fe66c0ccafc6b1b428e526a1810719a5207e05bc3766b0b3c144acd40ac14d"

RPROVIDES:${PN} += "libspeechd-devel \
pkgconfig-speech-dispatcher \
speech-dispatcher-devel \
speechd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeechd2 \
pkgconfig-glib-2.0"

inherit rpm
