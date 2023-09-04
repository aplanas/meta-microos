SUMMARY = "XWindow driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the XWindow braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-driver-xwindow-6.6-1.1.aarch64.rpm"
RPM_HASH = "ee13d33e9a99628765d3472498ef55eba4b7b87f825fffc9d0c0209aa1380d2070837798abfd8b0b5b9db071ae7d7136c671db8836c083a2fb8f3c61f211b46c"

RPROVIDES:${PN} += "brltty-driver-xwindow \
libbrlttybxw.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
