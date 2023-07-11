SUMMARY = "IMA/EVM control utility libary"
DESCRIPTION = "This package provides the shared library for IMA/EVM (Integrity \
Measurement Architecture/Extended Verification Module)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "libimaevm4-1.5-1.3.aarch64.rpm"
RPM_HASH = "45d7d208e6e2b21f7e752815acec1c92b083e2c5ac2c2e6a26222bbeb4a998af587008e4f242c8da5b64037c4624c9cf8f355a002bf87e15457edd94d6a60be9"

RPROVIDES:${PN} += "libimaevm.so.4 \
libimaevm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
