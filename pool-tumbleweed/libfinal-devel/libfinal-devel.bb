SUMMARY = "Development files for the FINAL CUT text widget library"
DESCRIPTION = "FINAL CUT is a class library and widget toolkit with full mouse \
support for creating a text-based user interface. The library supports \
the programmer to develop an application for the text console. It allows \
the simultaneous handling of multiple windows on the screen. \
The C++ class design was inspired by the Qt framework. It provides \
common controls like dialog windows, push buttons, check boxes, \
radio buttons, input lines, list boxes, status bars and so on."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "libfinal-devel-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "8fa102ed6fc960e1ab5311c8165ac017241b35c585e91c8d93e740c74e03a3bad6b02856f2a6a4b054a92e73ee30a5d8df810bfeb1cfe52355a3242d13e78055"

RPROVIDES:${PN} += "libfinal-devel \
libfinal-devel(aarch-64) \
pkgconfig(finalcut)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bdftopcf \
coreutils \
gcc-c++ \
gpm-devel \
grep \
gzip \
libfinal0 \
ncurses-devel \
sed \
vim"

inherit rpm
