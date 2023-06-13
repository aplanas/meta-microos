SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the runtime libraries of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime1-1.7.3-2.18.aarch64.rpm"
RPM_HASH = "d45633ed3f7e2fc1295709bcfba3a17bf9122780ada4dea0ddab9d189f1dae7c7ce3f89f059b5887bfab15695ee16472fe0d7bcac93e7c8618672d478d15e9be"

RPROVIDES:${PN} += "librime.so.1()(64bit) \
librime1 \
librime1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcapnp-0.10.4.so()(64bit) \
libgcc_s.so.1()(64bit) \
libglog.so.0()(64bit) \
libleveldb.so.1()(64bit) \
libm.so.6()(64bit) \
libmarisa.so.0()(64bit) \
libopencc.so.1.1()(64bit) \
libstdc++.so.6()(64bit) \
libyaml-cpp.so.0.7()(64bit)"

inherit rpm
