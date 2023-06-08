SUMMARY = "BrlAPI driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the BrlAPI braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-brlapi-6.5-2.3.aarch64.rpm"
RPM_HASH = "f5503b98a45858bdfd7e7bb5b81fc0d9579eb43108bb5586befe15a9c6d460996bc4adbedda657466e4a1a354fa763d3a36c2f9971402fe6da6a4d9a0db5e9da"

RPROVIDES:${PN} += "brltty-driver-brlapi brltty-driver-brlapi(aarch-64) libbrlttybba.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
