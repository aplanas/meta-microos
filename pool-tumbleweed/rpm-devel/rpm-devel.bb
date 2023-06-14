SUMMARY = "Development files for librpm"
DESCRIPTION = "This package contains the RPM C library and header files.  These \
development files will simplify the process of writing programs which \
manipulate RPM packages and databases and are intended to make it \
easier to create graphical package managers or any other tools that \
need an intimate knowledge of RPM packages in order to function."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-devel-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "486b2a0d73ecfb78e03f049788bebda78fde3e250f423fd539dc8765c07cb53ed94ea26ff0739ee8012f6420a0712d6cc62f8655ffa42317c98e7068bd18990c"

RPROVIDES:${PN} += "pkgconfig-rpm \
rpm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libzstd \
pkgconfig-popt \
popt-devel \
rpm"

inherit rpm
