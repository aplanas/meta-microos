SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-hppa-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "6d12518f89102d51e045ba764391f962f438b197c476e6c221484a1a17e88566cfccc3bd1748a204396f25a7ffd313b2b1768749efdcbead2f158d5bd7ba7205"

RPROVIDES:${PN} += "cross-hppa-binutils \
cross-hppa-binutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
