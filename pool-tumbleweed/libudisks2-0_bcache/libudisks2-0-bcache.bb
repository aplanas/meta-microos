SUMMARY = "UDisks module for Bcache"
DESCRIPTION = "This package contains the UDisks module for bcache support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_bcache-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "a83f36fd6a46798855be2e641fc8357d71995e70471711f8aeaff424d316161f9df667f524c20cabf80f050ae60e0cabbd741b65bca00a24df1b40170e8b9ce6"

RPROVIDES:${PN} += "libudisks2-0_bcache \
libudisks2-0_bcache(aarch-64) \
libudisks2_bcache.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblockdev-kbd \
libblockdev.so.2()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libudisks2-0"

inherit rpm
