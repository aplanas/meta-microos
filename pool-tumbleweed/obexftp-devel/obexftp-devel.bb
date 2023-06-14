SUMMARY = "Development package for obexftp"
DESCRIPTION = "Files needed for software development using obexftp."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-devel-0.24.2-1.22.aarch64.rpm"
RPM_HASH = "6fa08814521ebd7acba5f3b6dbc1ac8fb683311e109b995a22285e63e355134a11665b02b71baacee8a799ac49c462e4fd227d3f578c57189ad7faead204d1aa"

RPROVIDES:${PN} += "obexftp-devel \
pkgconfig-obexftp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
obexftp \
openobex-devel \
pkgconfig-bluez \
pkgconfig-openobex"

inherit rpm
