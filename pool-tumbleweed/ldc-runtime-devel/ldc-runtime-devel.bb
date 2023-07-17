SUMMARY = "Development files for the D runtime library"
DESCRIPTION = "This package contains the druntime development files necessary for developing \
with LDC."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "ldc-runtime-devel-1.32.2-1.1.aarch64.rpm"
RPM_HASH = "dca2e62e7d1d0534beb57ced99e323c0da24db999acf3298c313d34c7101e6899d75d775a221ea22c7e7eacf1f002bc34255c93681cd62ca630e2ddaaa18aa95"

RPROVIDES:${PN} += "ldc-runtime-devel"

RDEPENDS:${PN} += "libdruntime-ldc102"

inherit rpm
