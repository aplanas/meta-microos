SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libptexenc1-1.4.3-92.1.aarch64.rpm"
RPM_HASH = "70b2ad44ffbb07aa7f172fb653df9ba9097ca7cccce7ab86ed3a7c0d169ba502e4aaa4731ba17a4c294e54b77acffc33ff36b062c62293532c721a70421fff21"

RPROVIDES:${PN} += "libptexenc.so.1 \
libptexenc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
