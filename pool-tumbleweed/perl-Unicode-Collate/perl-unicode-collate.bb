SUMMARY = "Unicode Collation Algorithm"
DESCRIPTION = "This module is an implementation of Unicode Technical Standard #10 (a.k.a. \
UTS #10) - Unicode Collation Algorithm (a.k.a. UCA)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.31"

RPM_NAME = "perl-Unicode-Collate-1.31-1.11.aarch64.rpm"
RPM_HASH = "2ed39c050ecdc91e992e35ce97cf0a84c47aba303f791ebcba573d3c540850525c68c683c01d069155876343ba4bbba4a238f8f0d60be851b6e8e8eef2e7d73f"

RPROVIDES:${PN} += "perl-Unicode--Collate \
perl-Unicode--Collate--CJK--Big5 \
perl-Unicode--Collate--CJK--GB2312 \
perl-Unicode--Collate--CJK--JISX0208 \
perl-Unicode--Collate--CJK--Korean \
perl-Unicode--Collate--CJK--Pinyin \
perl-Unicode--Collate--CJK--Stroke \
perl-Unicode--Collate--CJK--Zhuyin \
perl-Unicode--Collate--Locale \
perl-Unicode-Collate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
