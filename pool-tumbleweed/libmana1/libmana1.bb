SUMMARY = "MANA runtime library"
DESCRIPTION = "This package contains the mana runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libmana1-45.0-1.1.aarch64.rpm"
RPM_HASH = "f5da088db16a39e491745487508a33ebd1045178e5cddb5cb91671c8dffbd1e948e1632dd0630e5931f471f174b14db52efa72ee18e4ce464ce0e14e4c926bd1"

RPROVIDES:${PN} += "libmana.so.1()(64bit) \
libmana.so.1(MANA_1.0)(64bit) \
libmana1 \
libmana1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm
