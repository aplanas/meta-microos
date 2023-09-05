SUMMARY = "Default version of nodejs"
DESCRIPTION = "Depends on the most current and recommended version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "nodejs-default-6.0-2.1.aarch64.rpm"
RPM_HASH = "9206002d954fa64ae4adf6c5f4d227306df2d39cad76ebea06144cd2df159c1a41359f7f3d5cefb1165385be367816e978712f093489786e2a7248596804816c"

RPROVIDES:${PN} += "nodejs \
nodejs-default \
nodejs-engine"

RDEPENDS:${PN} += "nodejs-common \
nodejs20"

inherit rpm
