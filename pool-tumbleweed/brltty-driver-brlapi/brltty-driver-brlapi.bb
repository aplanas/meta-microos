SUMMARY = "BrlAPI driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the BrlAPI braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-brlapi-6.5-3.1.aarch64.rpm"
RPM_HASH = "908f2b9dd29d8ec761ea2d6d4c7b8ba9d8215e246f74d0e4b987dc4f03b21500a0d2566e1ed70e6aa542cb2e6924e0e430587c6de67469330631002eb00f031a"

RPROVIDES:${PN} += "brltty-driver-brlapi \
libbrlttybba.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
