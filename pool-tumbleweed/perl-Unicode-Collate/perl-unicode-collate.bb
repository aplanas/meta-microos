SUMMARY = "Unicode Collation Algorithm"
DESCRIPTION = "This module is an implementation of Unicode Technical Standard #10 (a.k.a. \
UTS #10) - Unicode Collation Algorithm (a.k.a. UCA)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.31"

RPM_NAME = "perl-Unicode-Collate-1.31-1.10.aarch64.rpm"
RPM_HASH = "83fd79b84871e012f5e175f58a00aa5cf604a1bcbb6e97a784f24229e206eec4eabd0fcb55a9e9eaa578d8acc956deb3afe1da85a331227eaf5fcf0908f4c331"

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
perl--MODULE-COMPAT-5.36.0"

inherit rpm
