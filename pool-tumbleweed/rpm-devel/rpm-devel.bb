SUMMARY = "Development files for librpm"
DESCRIPTION = "This package contains the RPM C library and header files.  These \
development files will simplify the process of writing programs which \
manipulate RPM packages and databases and are intended to make it \
easier to create graphical package managers or any other tools that \
need an intimate knowledge of RPM packages in order to function."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-devel-4.18.0-5.3.aarch64.rpm"
RPM_HASH = "16c378db4dcd5034c9045aad7f9763ad9147b05fd76143aa87654fb3a927f8d12ef217942a45a711d9be0e0a7e7047050ebc473f65e7ffa5c3c8e472dcd70f22"

RPROVIDES:${PN} += "pkgconfig-rpm \
rpm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libzstd \
pkgconfig-popt \
popt-devel \
rpm"

inherit rpm
