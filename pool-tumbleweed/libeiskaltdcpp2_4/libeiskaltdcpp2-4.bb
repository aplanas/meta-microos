SUMMARY = "Shared library for eiskaltdcpp"
DESCRIPTION = "This package contains Shared library for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "libeiskaltdcpp2_4-2.4.2-1.13.aarch64.rpm"
RPM_HASH = "e8ce05745f7777389ea530608d669bce662434445749f75919881a78cdd5b202e17a35ae5d18c520651063cc626b6a70fc1608578b7a88cb33b1a5d5206171e6"

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
