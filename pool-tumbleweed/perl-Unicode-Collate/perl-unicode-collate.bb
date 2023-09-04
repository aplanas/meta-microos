SUMMARY = "Unicode Collation Algorithm"
DESCRIPTION = "This module is an implementation of Unicode Technical Standard #10 (a.k.a. \
UTS #10) - Unicode Collation Algorithm (a.k.a. UCA)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.31"

RPM_NAME = "perl-Unicode-Collate-1.31-1.12.aarch64.rpm"
RPM_HASH = "ba515558e191c56e6e2803a19096bbb1c180ed977b24901ac695aaf5bd9c393b349621c01e8d6e8e438a8ab45835abaf0d92f13d4cbc1a9dba12ec82a18ed264"

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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
