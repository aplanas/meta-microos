SUMMARY = "Shared library for IBM's TPM 2.0 TSS"
DESCRIPTION = "Shared library for IBM's TPM 2.0 TSS tools"
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libibmtss1-1.6.0-4.5.aarch64.rpm"
RPM_HASH = "163547af41fad8b69c0a76423b3db241439c9cb291e09188f94bd495394fd9d725b1cc81a2c9aa56676b7f62cf1d2d7377d69db475b3fbec73f064cf5c72d480"

RPROVIDES:${PN} += "libibmtss.so.1 \
libibmtss1 \
libibmtssutils.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
