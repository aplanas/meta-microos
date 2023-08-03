SUMMARY = "Development files for dpkg"
DESCRIPTION = "Libraries and header files for dpkg."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.22"

RPM_NAME = "dpkg-devel-1.21.22-1.1.aarch64.rpm"
RPM_HASH = "eab2c30a4e6f19f59f343935f6f10e039bc26b55351b53fe559696cf46f861b2247e1b5e91f7a17d59d1a53eb39da9519c83e7c26f75e18e16a8bb7cb82db5b7"

RPROVIDES:${PN} += "deb-devel \
dpkg-devel \
pkgconfig-libdpkg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dpkg \
libmd-devel"

inherit rpm
