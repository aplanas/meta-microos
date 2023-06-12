SUMMARY = "UDisks module for LSM"
DESCRIPTION = "This package contains the UDisks module for LSM support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_lsm-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "ac106bb700902af078f52b5f58f5b44d5f8395be20823968c22d3fb1ceddd84366dcf2e57454b4fdf36d37f5fb79e379de69c9ac8149b95a856a8541a6ed208b"

RPROVIDES:${PN} += "config(libudisks2-0_lsm) \
libudisks2-0_lsm \
libudisks2-0_lsm(aarch-64) \
libudisks2_lsm.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libconfig.so.11()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libstoragemgmt \
libstoragemgmt.so.1()(64bit) \
libudisks2-0"

inherit rpm
