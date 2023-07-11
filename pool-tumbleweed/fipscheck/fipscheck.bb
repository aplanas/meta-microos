SUMMARY = "A library for integrity verification of FIPS validated modules"
DESCRIPTION = "FIPSCheck is a library for integrity verification of FIPS validated \
modules. The package also provides helper binaries for creation and \
verification of the HMAC-SHA256 checksum files."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "fipscheck-1.7.0-1.6.aarch64.rpm"
RPM_HASH = "7f7686b4f6b661ee77ea434805aaa04ab1e8f0eed0a3c3b9c87e5812230060cbb846eb25e1c0f71439a6266881591eb774cb9d266d1836e9a766112ad77bfd28"

RPROVIDES:${PN} += "fipscheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfipscheck.so.1 \
libfipscheck1"

inherit rpm
