SUMMARY = "CAVS testing framework and utilities"
DESCRIPTION = "Includes the Composite Application Validation System (CAVS) \
testing framework and utilities."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-cavs-1.0.2u-20.1.aarch64.rpm"
RPM_HASH = "5d852d561e8666f447e3b681c4ea6b201a0c503bb0ad594c247385ad1a91c7899b6c772416ca2cd943e51068ddaee473288d451ff5f4235fac1b1ecdcaa17dfc"

RPROVIDES:${PN} += "openssl-1-0-0-cavs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenssl1-0-0 \
libz.so.1"

inherit rpm
