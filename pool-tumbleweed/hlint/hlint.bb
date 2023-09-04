SUMMARY = "Source code suggestions"
DESCRIPTION = "HLint gives suggestions on how to improve your source code."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "hlint-3.5-1.16.aarch64.rpm"
RPM_HASH = "70bf1136d02a51257c30bea90ab37f58f804f1de944917cb1743c8540d88078f82f3c457d28f7159fa10c8ae798b675c9e3b087887940a21186ef590bb7b324a"

RPROVIDES:${PN} += "hlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2"

inherit rpm
