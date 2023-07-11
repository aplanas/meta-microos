SUMMARY = "Minuet: Build Environment"
DESCRIPTION = "Development headers and libraries for Minuet."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "minuet-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e95585cb55a7e0103abab1236a41c4caccf5c59638c5c7f8779899f07d81fad8ec3837a9fe4331ed6a8607cd9557a9d0ac7d8c93da17db4bc48d9e84a823d951"

RPROVIDES:${PN} += "minuet-devel"

RDEPENDS:${PN} += "minuet"

inherit rpm
