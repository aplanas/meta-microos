SUMMARY = "C interface for the drpm library"
DESCRIPTION = "This package provides a C interface (drpm.h) for the drpm library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1"

RPM_NAME = "libdrpm-devel-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "fe262b2ad44b4af336476cb86b17f8eecbeb03dcfb0cbf4379bd33975590bfc5f72ee1690cdd1fa6b7b4d4ca9a89067e6c2f4eb2dcddbbacffdb61fd02817dad"

RPROVIDES:${PN} += "drpm-devel \
drpm-devel(aarch-64) \
libdrpm-devel \
libdrpm-devel(aarch-64) \
pkgconfig(drpm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdrpm0(aarch-64)"

inherit rpm
