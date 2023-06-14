SUMMARY = "UDisks module for LSM"
DESCRIPTION = "This package contains the UDisks module for LSM support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_lsm-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "ac106bb700902af078f52b5f58f5b44d5f8395be20823968c22d3fb1ceddd84366dcf2e57454b4fdf36d37f5fb79e379de69c9ac8149b95a856a8541a6ed208b"

RPROVIDES:${PN} += "config-libudisks2-0-lsm \
libudisks2-0-lsm \
libudisks2-lsm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libstoragemgmt \
libstoragemgmt.so.1 \
libudisks2-0"

inherit rpm
