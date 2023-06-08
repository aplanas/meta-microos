SUMMARY = "Aspell backend for the Enchant spell checking library"
DESCRIPTION = "Aspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-aspell-2.2.15-3.3.aarch64.rpm"
RPM_HASH = "14a6dfc73b2edce379e62e6f2df67d13a45f24f1791ba3c5b51f6bfacb7dc1a94a5bcd91893d360ea7d24216949ccc578929d23114d435d7dd56e62fa7b21f47"

RPROVIDES:${PN} += "enchant-2-backend enchant-2-backend-aspell enchant-2-backend-aspell(aarch-64)"
RDEPENDS:${PN} += "libaspell.so.15()(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
