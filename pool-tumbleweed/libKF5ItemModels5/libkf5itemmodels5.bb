SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ItemModels5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2ff79043ad0be607650b6d921ad5e2d8615b1a12cc706f52be318dd78ff16d2aada68c6954356a97acff5f27e8811e05cf10b1d8caf0e8c906cae7a2c8a3d263"

RPROVIDES:${PN} += "libKF5ItemModels.so.5 \
libKF5ItemModels5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
