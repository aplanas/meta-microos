SUMMARY = "Speech Dispatcher driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the Speech Dispatcher speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-driver-speech-dispatcher-6.6-1.1.aarch64.rpm"
RPM_HASH = "b3c235c7b2e811fcbe6457bf5e0943ac82e99d6f40f5ee3d6d8397595cf5bd9ba52a7e8fe630aeb8ea5c89fac5399cb9e00dcb270aa46840e1b9861c1547889a"

RPROVIDES:${PN} += "brltty-driver-speech-dispatcher \
libbrlttyssd.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libspeechd.so.2"

inherit rpm
