SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ItemModels5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2472aea803cb51478bcc361d4d6f27b37b5c472c36bcccc4cff1a233775f6316925e354306d76fdf2fdc4e4788aa801e4c3b83c91b1dd0ede1d79da05c4d53b3"

RPROVIDES:${PN} += "libKF5ItemModels.so.5()(64bit) \
libKF5ItemModels5 \
libKF5ItemModels5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
