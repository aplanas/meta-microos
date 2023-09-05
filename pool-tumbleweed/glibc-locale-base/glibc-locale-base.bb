SUMMARY = "en_US Locale Data for Localized Programs"
DESCRIPTION = "Locale data for the internationalisation features of the GNU C library. \
This package contains only the U.S. English locale."
LICENSE = "GPL-2.0-or-later & MIT & LGPL-2.1-or-later"

PV = "2.38"

RPM_NAME = "glibc-locale-base-2.38-2.1.aarch64.rpm"
RPM_HASH = "421bfa3133321cbdbb1f19e750d4f9c43d00c3197bae89170504ddc789534522975b1f8db1fab9ba43eeb61e3184f7fc6337d7c825dc8e06fa375482ce76a05e"

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
