SUMMARY = "Shared library for IBM's TPM 2.0 TSS"
DESCRIPTION = "Shared library for IBM's TPM 2.0 TSS tools"
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libibmtss1-1.6.0-4.4.aarch64.rpm"
RPM_HASH = "4c6ee02afe62b13d357bca661cc1cac4ffb47e3b0e14c83048fa6efcfdb21ace49a0d81fad19fb2828ddbbad393be91702cde984bfb12011ec1a713db62fb370"

RPROVIDES:${PN} += "libibmtss.so.1 \
libibmtss1 \
libibmtssutils.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
