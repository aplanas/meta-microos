SUMMARY = "Nuspell backend for the Enchant spell checking library"
DESCRIPTION = "Nuspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-2-backend-nuspell-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "cf2660f8da802a76acdb3ae84afe62f34552b0ae1f63483af2cc14a0b3ad4bf40cdf18a8766f85be88be705cd5ed0ad331f8397f2a63fcdaa6fc8b2946751b7d"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-nuspell \
enchant-2-backend-nuspell(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libenchant-2.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libicuuc.so.73()(64bit) \
libnuspell.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
