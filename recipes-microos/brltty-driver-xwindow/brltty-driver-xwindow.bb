SUMMARY = "XWindow driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the XWindow braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-xwindow-6.5-2.3.aarch64.rpm"
RPM_HASH = "0eca9680ff48231645ae0b0ca1220b94447ec85b2abc58c43f3c950fe4d66eadc93a910b5c68777255edb09ef1ed805d0926091f8aa0b747d67aa076280acfc0"

RPROVIDES:${PN} += "brltty-driver-xwindow brltty-driver-xwindow(aarch-64) libbrlttybxw.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
