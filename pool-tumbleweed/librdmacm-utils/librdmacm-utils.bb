SUMMARY = "Examples for the librdmacm library"
DESCRIPTION = "Example test programs for the librdmacm library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "librdmacm-utils-45.0-1.2.aarch64.rpm"
RPM_HASH = "833cddd50d80c923e1b499b6ef98a0a0ff44cbc0aa0a942557a1f6a2a9c5aff1b5028058793ac1a1c495d0ce19544372d402524c9b8cb4a56a74ee633f8bd067"

RPROVIDES:${PN} += "librdmacm-tools \
librdmacm-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
