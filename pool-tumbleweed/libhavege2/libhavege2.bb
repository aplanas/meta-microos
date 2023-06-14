SUMMARY = "Haveged interface library"
DESCRIPTION = "Shared object for the haveged library. \
This package contains the haveged implementation of the HAVEGE \
algorithm and supporting features."
LICENSE = "GPL-3.0-only"

PV = "1.9.18"

RPM_NAME = "libhavege2-1.9.18-2.3.aarch64.rpm"
RPM_HASH = "7ae0530d0b3b3617c534e7bc7fb816c0a82f5dd017853dbb86c80f653057c0b21b3a91cba0a46f8ba3ae56a5a135ca29fb249239f85980b7e8c59153d7189b0f"

RPROVIDES:${PN} += "libhavege.so.2 \
libhavege2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
