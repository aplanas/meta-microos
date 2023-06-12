SUMMARY = "Parallelizing Multi-Protocol Utility for Downloading Files"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
aria2 currently supports HTTP, FTP, and BitTorrent."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "1.36.0"

RPM_NAME = "aria2-1.36.0-1.11.aarch64.rpm"
RPM_HASH = "473f8960febd61290ce10a9f74e6d02899913458de88bba93df08283831a4a4082701973dbae77b53840fd5478c92a85f98ed870270dfe95499ac96cd631a04c"

RPROVIDES:${PN} += "aria2 \
aria2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaria2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
