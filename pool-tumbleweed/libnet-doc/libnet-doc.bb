SUMMARY = "Documentation for libnet"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libnet-doc-1.2-3.8.aarch64.rpm"
RPM_HASH = "636e73e34ddc56ce42af5e2b15a09b97b67f9cf1adf8eda1ddecf94fd2c298ee6d867e8a251265d8e598ca4b9a2bc186e884ecea5778dc60b3ba30a053a9b22c"

RPROVIDES:${PN} += "libnet-doc \
libnet-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
