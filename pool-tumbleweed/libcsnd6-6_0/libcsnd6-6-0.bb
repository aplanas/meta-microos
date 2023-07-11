SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use. \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsnd6-6_0-6.18.1-3.2.aarch64.rpm"
RPM_HASH = "1f4b261e4184fa468a8fccc1a98ecc40c5ef8cb2555894376807e338345576eb5850a396f9fac06f3cdc57d5339034833ec394657698a9fa40d9a4a83de1c5d5"

RPROVIDES:${PN} += "libcsnd6-6-0 \
libcsnd6.so.6.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcsound64.so.6.0 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
