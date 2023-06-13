SUMMARY = "Toolbox for lexical processing and morphological analysis"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process. \
 \
The package provides three programs, lt-comp, the compiler, \
lt-proc, the processor, and lt-expand, which generates all possible \
mappings between surface forms and lexical forms in the dictionary."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.1"

RPM_NAME = "lttoolbox-3.7.1-1.5.aarch64.rpm"
RPM_HASH = "b6b1afbcbe01599c024a575a10099e6fb25401a5a1e8de50d8dc1784f73b674c021f6d9bf2dbb67c3ec4501e8c6eab2f1d7793b12a65d85e70817d2f07158e4c"

RPROVIDES:${PN} += "lttoolbox \
lttoolbox(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicuio.so.73()(64bit) \
liblttoolbox.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
