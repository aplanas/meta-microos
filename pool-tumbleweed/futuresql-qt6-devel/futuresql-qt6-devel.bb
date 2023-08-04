SUMMARY = "Development files for futuresql"
DESCRIPTION = "This package contains development files needed to use futuresql."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "futuresql-qt6-devel-0.1.1-1.1.aarch64.rpm"
RPM_HASH = "cbdf86e2053beb7d3cf1b31a1254f9d4a9b215b185ef5f665f4b19ff6fd47816e9d38c4f800b550390216aa86167727fd75574d1a18633a4e187e5ece85c4139"

RPROVIDES:${PN} += "cmake-FutureSQL6 \
futuresql-qt6-devel"

RDEPENDS:${PN} += "libfuturesql6-0"

inherit rpm
