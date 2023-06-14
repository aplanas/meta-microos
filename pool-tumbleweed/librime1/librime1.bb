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

RPROVIDES:${PN} += "librime.so.1 \
librime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcapnp-0.10.4.so \
libgcc-s.so.1 \
libglog.so.0 \
libleveldb.so.1 \
libm.so.6 \
libmarisa.so.0 \
libopencc.so.1.1 \
libstdc++.so.6 \
libyaml-cpp.so.0.7"

inherit rpm
