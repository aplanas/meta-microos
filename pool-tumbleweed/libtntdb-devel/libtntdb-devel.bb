SUMMARY = "Development files for tntdb"
DESCRIPTION = "Headers and so links for tntdb library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libtntdb-devel-1.4-1.12.aarch64.rpm"
RPM_HASH = "c283a0aed85192fc15b9342449df2f1a529511ad52f9a56759e001fc0bbe401fa9cd8fab84440e847d6f39dfc6870ec049d52d9ed8440b56af6bf915384025dc"

RPROVIDES:${PN} += "libtntdb-devel \
pkgconfig-tntdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtntdb5 \
pkgconfig-cxxtools"

inherit rpm
