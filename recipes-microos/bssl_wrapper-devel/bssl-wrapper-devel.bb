SUMMARY = "Development files for bssl_wrapper"
DESCRIPTION = "bssl_wrapper is a library which translates BoringSSL calls to OpenSSL calls. \
 \
This package contains development files for bssl_wrapper."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bssl_wrapper-devel-2.0.1-1.9.aarch64.rpm"
RPM_HASH = "9b05e3eee07237c9bb403dcc957445d9671ebaf539c23cb084e0ba26afda1ec182d4efde5e55ce91f6059378f9b3a2df759e0e55fad6f19758a1eaa385a46af0"

RPROVIDES:${PN} += "bssl_wrapper-devel bssl_wrapper-devel(aarch-64)"
RDEPENDS:${PN} += "libbssl_wrapper_lib0"

inherit rpm
