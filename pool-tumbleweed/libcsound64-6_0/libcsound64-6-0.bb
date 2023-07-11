SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsound64-6_0-6.18.1-3.2.aarch64.rpm"
RPM_HASH = "5ea04954a7762d47045b702f5b49e6e0279ee0e91213a429d16f012ccced161311cc59d5bed75bf328370a6e9c69b3a7bf1afcefb422d387b5072b586d8146da"

RPROVIDES:${PN} += "libcsound64-6-0 \
libcsound64.so.6.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
