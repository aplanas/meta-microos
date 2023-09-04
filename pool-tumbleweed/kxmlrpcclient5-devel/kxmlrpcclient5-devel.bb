SUMMARY = "Library containing simple XML-RPC Client support: Build Environment"
DESCRIPTION = "Library containing simple XML-RPC Client support. Development files."
LICENSE = "BSD-2-Clause"

PV = "5.109.0"

RPM_NAME = "kxmlrpcclient5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "1f5a3aaf08ba0dfb3249f9b277e50b6a4a8f3f4f48dc23364eac6b394cacacf0b93ac666c2824a9eda94ec487bacc22f43aa60f04caa40859c6b7b60e90bdd9e"

RPROVIDES:${PN} += "cmake-KF5XmlRpcClient \
kxmlrpcclient5-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
libKF5XmlRpcClient5"

inherit rpm
