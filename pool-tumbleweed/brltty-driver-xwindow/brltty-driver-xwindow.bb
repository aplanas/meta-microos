SUMMARY = "XWindow driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the XWindow braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-xwindow-6.5-3.1.aarch64.rpm"
RPM_HASH = "ec86b829b5f4e25c3b0bfd96db837c119bfd5c6dd1e3829dc99f0e801633da9dd706bff0cd0ef7a12188c16d6bf00769063e617810114fd14d427bf03ff5fb53"

RPROVIDES:${PN} += "brltty-driver-xwindow \
libbrlttybxw.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
