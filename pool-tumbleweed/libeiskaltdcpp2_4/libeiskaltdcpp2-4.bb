SUMMARY = "Shared library for eiskaltdcpp"
DESCRIPTION = "This package contains Shared library for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "libeiskaltdcpp2_4-2.4.2-1.14.aarch64.rpm"
RPM_HASH = "a59e8a6d3ebe7c67913e13c51115005f564193f978bcea0f7c72d3f5950a2cd07cd15881adfd1e9589c0c38b4425e30dd0fa1a43926991ef26ac7bb4d8a74dd1"

RPROVIDES:${PN} += "libeiskaltdcpp.so.2.4 \
libeiskaltdcpp2-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libidn.so.12 \
liblua5.1.so.5 \
libminiupnpc.so.17 \
libpcrecpp.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
