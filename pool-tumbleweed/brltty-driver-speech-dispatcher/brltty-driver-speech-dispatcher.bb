SUMMARY = "Speech Dispatcher driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the Speech Dispatcher speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-speech-dispatcher-6.5-3.1.aarch64.rpm"
RPM_HASH = "bcd731fd4f24c7d1132050ab2aa148df4172c8fcffa3415589f4d6f1aae51a1c5f9f713cb8b9d6f3f6c40712d3e0f5e6d3a511acb56240874ba711764f1ebc24"

RPROVIDES:${PN} += "brltty-driver-speech-dispatcher \
libbrlttyssd.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libspeechd.so.2"

inherit rpm
