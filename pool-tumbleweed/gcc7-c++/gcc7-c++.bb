SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-c++-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "0e41398bc686238eb37780ede00f17fb90c38fdbbebfe34d1256dfd480b550370973d2e99315b30f44ab3d7bb57dab45235609a76f5f3b8f6a4520971b207d96"

RPROVIDES:${PN} += "gcc7-c++"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc7 \
libz.so.1"

inherit rpm
