SUMMARY = "Library containing simple XML-RPC Client support: Build Environment"
DESCRIPTION = "Library containing simple XML-RPC Client support. Development files."
LICENSE = "BSD-2-Clause"

PV = "5.108.0"

RPM_NAME = "kxmlrpcclient5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "cb4a58d1294829da2a31c821cc94ec16ac815cccb458b857d7ff7a27923939dc0a8f18e76ba75adf7094b510ddf3d76386a2921704a9ad6e16f3b6da1ca55112"

RPROVIDES:${PN} += "cmake-KF5XmlRpcClient \
kxmlrpcclient5-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
libKF5XmlRpcClient5"

inherit rpm
