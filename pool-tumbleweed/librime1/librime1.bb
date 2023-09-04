SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the runtime libraries of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime1-1.7.3-2.20.aarch64.rpm"
RPM_HASH = "f90b1a7f803234ecfff9b27e9ba12c97ce76b679f03f9b2685cb834794607048363b28cb3e5de758bccf6d54ddec8ff0bc681144f6ad69dfa0e0dd384e31e2b2"

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
libyaml-cpp.so.0.8"

inherit rpm
