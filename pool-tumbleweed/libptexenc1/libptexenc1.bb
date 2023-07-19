SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libptexenc1-1.4.3-93.1.aarch64.rpm"
RPM_HASH = "68342f44fff2b8a7c3a1fb5255447a47add90da77aeab6bcbf6aa419f05cd20fc0024843a6bce00e12db64a34bea2bf84db1279ac9f95f3936213dc2aca4a197"

RPROVIDES:${PN} += "libptexenc.so.1 \
libptexenc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
