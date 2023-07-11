SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the runtime libraries of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime1-1.7.3-2.19.aarch64.rpm"
RPM_HASH = "b6ed941b4bf928a2fd9a2076ca5c5ea8c8b28dd8006ac9cf7cba669342ed36faf7e833ad40fdfd8bbd29189d2a2d4408f14cb6820d00cfeaa02e684a6184e9b4"

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
