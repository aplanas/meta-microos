SUMMARY = "Aspell backend for the Enchant spell checking library"
DESCRIPTION = "Aspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-aspell-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "1b3379501bc21b2009f58c674105dead13439c9259b65712bf49c0fafc67562f3b43292d2b98d4d36bb23ae277b872120f283cc6b708f7d2f12c6e730ba3f7dc"

RPROVIDES:${PN} += "enchant-2-backend enchant-2-backend-aspell enchant-2-backend-aspell(aarch-64)"
RDEPENDS:${PN} += "libaspell.so.15()(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
