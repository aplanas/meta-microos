SUMMARY = "Bloaty McBloatface: a size profiler for binaries"
DESCRIPTION = "Bloaty McBloatface will show you a size profile of ELF or Mach-O \
binaries so you can understand what is taking up space inside."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "bloaty-1.1-1.31.aarch64.rpm"
RPM_HASH = "a44752b5eeb0e126e8a92a22ad512c2871a26072e56e291f3258a1313f8dbaedcea2e4df1351aff83ae4b7288a06162f0fb452771c9d8fb550d2a53eac4c0365"

RPROVIDES:${PN} += "bloaty \
bloaty(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcapstone.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libre2.so.10()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
