SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python310-cchardet-2.1.18-1.4.aarch64.rpm"
RPM_HASH = "be80345372ebfd741b9ae599a9870285fd113e7d0502f2c3b517272227b4406406c4a90e4958909b80eceac1e00ea2bc50982e0ee75dc2dd348b60a264649b19"

RPROVIDES:${PN} += "python3-cchardet \
python3.10dist(faust-cchardet) \
python310-cchardet \
python310-cchardet(aarch-64) \
python3dist(faust-cchardet)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
