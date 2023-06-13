SUMMARY = "UDisks module for Zram"
DESCRIPTION = "This package contains the UDisks module for zram support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_zram-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "b0fd2ae5ed83668a0048eb4e60d5acd56b27816f624e0275e7744a5a671f413fbb8f949d7bb6a09bc3265bf07f8e916c1c7d46dd172af82e638926a5ca8784a9"

RPROVIDES:${PN} += "libudisks2-0_zram \
libudisks2-0_zram(aarch-64) \
libudisks2_zram.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libblockdev-kbd \
libblockdev-swap \
libblockdev.so.2()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libudisks2-0"

inherit rpm
