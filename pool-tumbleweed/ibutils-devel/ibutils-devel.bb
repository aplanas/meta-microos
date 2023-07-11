SUMMARY = "SDK for OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = "ibutils provides IB network and path diagnostics."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-devel-1.5.7.0.2-11.9.aarch64.rpm"
RPM_HASH = "9dbc79b439222eb1a9a3370855f438b528f4dee3d2ae21f3e7c4a2502370daaf3d3712e324cfe6a1748161f09097c9737539b843c60490ea0411d2f789f331f4"

RPROVIDES:${PN} += "ibutils-devel"

RDEPENDS:${PN} += "ibutils \
libibdm1"

inherit rpm
