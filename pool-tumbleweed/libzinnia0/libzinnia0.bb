SUMMARY = "Shared library for zinnia"
DESCRIPTION = "This package contains shared libraries used by zinnia."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "libzinnia0-0.07-2.7.aarch64.rpm"
RPM_HASH = "e3637ec992f3618f4f5f481a2ae283ccc25d53d26d9ae86076c87b733751184b903c046af23d796f8c8dafeebd9b0f14de20a1c8996042f7c918b1bdfa5c167b"

RPROVIDES:${PN} += "libzinnia.so.0()(64bit) \
libzinnia0 \
libzinnia0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
