SUMMARY = "UDisks module for Bcache"
DESCRIPTION = "This package contains the UDisks module for bcache support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_bcache-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "eebe55da4cc80703af25c14e05120c9e787320535cc3bdaadaab8bc5be742e409ac6b9868b922006930d1cf4cb03ce5f9a196f07fad7365e9db0328a057f30cf"

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
