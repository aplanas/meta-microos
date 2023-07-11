SUMMARY = "Development files for libff"
DESCRIPTION = "The libff-devel package contains libraries and header files for developing applications that use libff."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libff-devel-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "38f330852591aef3a74cc5013b18c43e5fd67555082d8bd39b1c5ae4a919f86de9c57c8846a86cef3e0b650008f4cfdcf3d5cc5aa47302636c5d544b4d1f4bfc"

RPROVIDES:${PN} += "libff-devel"

RDEPENDS:${PN} += "libff-1-0-0"

inherit rpm
