SUMMARY = "Libyui - Header files for the Qt (graphical) user interface"
DESCRIPTION = "This package contains the header files for the Qt based \
user interface component for libyui. \
 \
This package is not needed to develop libyui-based applications, \
only to develop extensions for libyui-qt."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "2220c1dbb90f982c39b1c6587fcf2af919aae1365d9f7fc9c0c8a44efadf4cc90c3d9a988b20300e64515e3635004d0519e276a22a0a025815fde88e25658e7a"

RPROVIDES:${PN} += "libyui-qt-devel \
pkgconfig-libyui-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fontconfig-devel \
libyui-devel \
libyui-qt16"

inherit rpm
