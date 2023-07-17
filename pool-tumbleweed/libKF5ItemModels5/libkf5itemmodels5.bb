SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ItemModels5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "0ee9bc946c795ddfa522419476a131a1ddd82845dd614542e326ee0f7f492c8a9d3b8797915bc9f3ba2beec39022c45610f4132a2ae17a77a5bae39e8a955fb8"

RPROVIDES:${PN} += "libKF5ItemModels.so.5 \
libKF5ItemModels5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
