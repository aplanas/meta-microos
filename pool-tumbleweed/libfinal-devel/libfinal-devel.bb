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

RPM_NAME = "libfinal-devel-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "2396d54ea69049dca682399b85e0927c494ae1d3a8eb740b2caa51f44bcc2176ea4712a0676715c271004173c0ce59cb359903d4428136e0d4b57b349ea44488"

RPROVIDES:${PN} += "libfinal-devel \
pkgconfig-finalcut"

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
