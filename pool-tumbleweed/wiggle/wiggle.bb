SUMMARY = "A Tool for Applying Patches with Conflicts"
DESCRIPTION = "Wiggle is a program for applying patches that 'patch' cannot apply due \
to conflicting changes in the original. \
 \
Wiggle will always apply all changes in the patch to the original. If \
it cannot find a way to cleanly apply a patch, it inserts it in the \
original in a manner similar to 'merge' and reports an unresolvable \
conflict."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "wiggle-1.3-1.11.aarch64.rpm"
RPM_HASH = "42e18476dfae0f20f1ca4b36127014d752587cad27048b935eaec1f085a6069738f4b0f5805f839dbf2d1b3111491dcbcdaaf6103238991d429be724c73d39ca"

RPROVIDES:${PN} += "wiggle \
wiggle(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
