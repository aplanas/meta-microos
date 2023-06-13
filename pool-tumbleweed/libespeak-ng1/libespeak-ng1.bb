SUMMARY = "Software speech synthesizer (text-to-speech)"
DESCRIPTION = "Software speech synthesizer (text-to-speech), support \
library."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "libespeak-ng1-1.51-1.8.aarch64.rpm"
RPM_HASH = "5098cf753d3fc103bc97ca1650c3f4ecd74c8c644ba19c5f5c72f49778ea0d347ea0a45bef405306e92a2e83e5f040f6825cc2ae4ceb9361f1ab30870879b13c"

RPROVIDES:${PN} += "libespeak-ng.so.1()(64bit) \
libespeak-ng1 \
libespeak-ng1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcaudio.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
