SUMMARY = "Development files for librpm"
DESCRIPTION = "This package contains the RPM C library and header files.  These \
development files will simplify the process of writing programs which \
manipulate RPM packages and databases and are intended to make it \
easier to create graphical package managers or any other tools that \
need an intimate knowledge of RPM packages in order to function."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-devel-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "fc4091e59a6e59b3aa7a4903daddeb1fa98c0a266f3cd1ff36a0cf2ba5985fe4e9ff0ddf2020c6c0056e64bb2a654a9eab75693cd94dae595daecce524980b62"

RPROVIDES:${PN} += "pkgconfig-rpm \
rpm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libzstd \
pkgconfig-popt \
popt-devel \
rpm"

inherit rpm
