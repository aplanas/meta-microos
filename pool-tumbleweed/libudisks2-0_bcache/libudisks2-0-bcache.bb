SUMMARY = "UDisks module for Bcache"
DESCRIPTION = "This package contains the UDisks module for bcache support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_bcache-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "a83f36fd6a46798855be2e641fc8357d71995e70471711f8aeaff424d316161f9df667f524c20cabf80f050ae60e0cabbd741b65bca00a24df1b40170e8b9ce6"

RPROVIDES:${PN} += "libudisks2-0-bcache \
libudisks2-bcache.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblockdev-kbd \
libblockdev.so.2 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libudisks2-0"

inherit rpm
