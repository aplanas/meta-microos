SUMMARY = "Library containing simple XML-RPC Client support: Build Environment"
DESCRIPTION = "Library containing simple XML-RPC Client support. Development files."
LICENSE = "BSD-2-Clause"

PV = "5.107.0"

RPM_NAME = "kxmlrpcclient5-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "474a48288d22d15ae9648a56dcf5e2b28107e78a4884b53df7c35abfb31b6b95663fa18afa57e9824201ee3f5085ea8207d38633b3fbf77a6ba1d9ef0aa1da11"

RPROVIDES:${PN} += "cmake-KF5XmlRpcClient \
kxmlrpcclient5-devel"

RDEPENDS:${PN} += "cmake-KF5KIO \
libKF5XmlRpcClient5"

inherit rpm
