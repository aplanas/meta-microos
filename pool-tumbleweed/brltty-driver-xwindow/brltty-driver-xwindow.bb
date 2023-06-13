SUMMARY = "XWindow driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the XWindow braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-xwindow-6.5-2.4.aarch64.rpm"
RPM_HASH = "d8148074bb490984608ce9a21b5a12a206f8877d888d9a245b99fc54d9dffde07ca9454d8371df0bbcc45e328936928ca12f8e65c097ac2d1a4e1b0022a97e20"

RPROVIDES:${PN} += "brltty-driver-xwindow \
brltty-driver-xwindow(aarch-64) \
libbrlttybxw.so()(64bit)"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
