SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "libptexenc1-1.4.3-93.2.aarch64.rpm"
RPM_HASH = "c05cc6c98fc0b56d90fc8aec9a79715420e7124ae855bdda4dff1d2f2a395dc4462cd84a415dc19268c4d08bf97f9a6c586d456b5285bab5f25391060899dbb0"

RPROVIDES:${PN} += "libptexenc.so.1 \
libptexenc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6"

inherit rpm
