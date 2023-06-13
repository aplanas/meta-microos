SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "102.11.0"

RPM_NAME = "mozjs102-102.11.0-1.2.aarch64.rpm"
RPM_HASH = "4cf95619d1669c5547513e34f6748f858a9d5082231751e6c335287d0b75019da05bf01105d6dce7ddfcac7b582489116eb6d5d8c1fbfa164f15f39a07c2cfbb"

RPROVIDES:${PN} += "mozjs102 \
mozjs102(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
