SUMMARY = "Documentation for libnet"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. This package contains documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libnet-doc-1.2-3.9.aarch64.rpm"
RPM_HASH = "71814a8f70840b7f87e953004c30fb06c99d60a54d23912ad7c8be93eaddd768ffd6baae09ce13d715d34e4d92854eef5a5e149662618552f26d26631dbb537d"

RPROVIDES:${PN} += "libnet-doc"

RDEPENDS:${PN} += ""

inherit rpm
