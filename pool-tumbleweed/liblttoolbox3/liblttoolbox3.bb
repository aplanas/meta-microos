SUMMARY = "Library for lexical processing and morphological analysis"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.1"

RPM_NAME = "liblttoolbox3-3.7.1-1.5.aarch64.rpm"
RPM_HASH = "72351ca54ab54688a5873d32d241b594e989b8aa4832e4e388a8b8e73879543a5b76a73d4229061798074bf0d7e3b534c8aaf11601a941e29f0ee1c9ec9b78ee"

RPROVIDES:${PN} += "liblttoolbox.so.3 \
liblttoolbox3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuio.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
