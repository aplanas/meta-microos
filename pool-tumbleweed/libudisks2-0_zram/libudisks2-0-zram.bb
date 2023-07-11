SUMMARY = "UDisks module for Zram"
DESCRIPTION = "This package contains the UDisks module for zram support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_zram-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "6f6f2e367c36cb6e893309ff43e3c8f51cfbbc154d41cf10a7a5a114bfe9ba140994261f0e2bf4688cc7e5985eb68bb993d5e51938a62347c64f34a48be5161a"

RPROVIDES:${PN} += "libudisks2-0-zram \
libudisks2-zram.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblockdev-kbd \
libblockdev-swap \
libblockdev.so.2 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libudisks2-0"

inherit rpm
