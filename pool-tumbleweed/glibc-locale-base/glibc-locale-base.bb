SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.38"

RPM_NAME = "glibc-locale-base-2.38-1.1.aarch64.rpm"
RPM_HASH = "d6873e5fa96b156709e81b6443e827193f817abc262da1fb8e8a5d45848997351f2dd30309407a165aaa075b8f3409e293d717a1d632ae8d1300712b2a868c9a"

RPROVIDES:${PN} += "glibc-locale-base \
libCNS.so \
libGB.so \
libISOIR165.so \
libJIS.so \
libJISX0213.so \
libKSC.so"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/sh \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
