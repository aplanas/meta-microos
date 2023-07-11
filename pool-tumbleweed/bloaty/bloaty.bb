SUMMARY = "Bloaty McBloatface: a size profiler for binaries"
DESCRIPTION = "Bloaty McBloatface will show you a size profile of ELF or Mach-O \
binaries so you can understand what is taking up space inside."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "bloaty-1.1-1.32.aarch64.rpm"
RPM_HASH = "5eadd4e33ad223bbaabec59604f5a11423b224fea9d95bb8bfc97fc48a604770b913f9ce5cd764176bfce9f9c239d44f62126e40bf77729cc511cfc589a9c3fc"

RPROVIDES:${PN} += "bloaty"

RDEPENDS:${PN} += "libc.so.6 \
libcapstone.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-3.21.12.so \
libre2.so.10 \
libstdc++.so.6"

inherit rpm
