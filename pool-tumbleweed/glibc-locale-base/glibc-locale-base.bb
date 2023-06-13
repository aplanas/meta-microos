SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-locale-base-2.37-4.1.aarch64.rpm"
RPM_HASH = "78e0f74fe2518cc99abc8dc406e21222a64a2ec8fce6ae0c6e2a416571d930bdfd55e483ebc173cd28fbe5e08176d411d7e0ef7f7aa2d0a6bc375c5d7e57016c"

RPROVIDES:${PN} += "glibc-locale-base \
glibc-locale-base(aarch-64) \
libCNS.so()(64bit) \
libGB.so()(64bit) \
libISOIR165.so()(64bit) \
libJIS.so()(64bit) \
libJISX0213.so()(64bit) \
libKSC.so()(64bit)"

RDEPENDS:${PN} += "/bin/cat \
/bin/sh \
glibc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_PRIVATE)(64bit) \
libc.so.6()(64bit)"

inherit rpm
