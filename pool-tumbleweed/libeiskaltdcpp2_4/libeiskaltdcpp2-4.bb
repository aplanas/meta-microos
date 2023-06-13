SUMMARY = "Shared library for eiskaltdcpp"
DESCRIPTION = "This package contains Shared library for EiskaltDC++."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "libeiskaltdcpp2_4-2.4.2-1.13.aarch64.rpm"
RPM_HASH = "e8ce05745f7777389ea530608d669bce662434445749f75919881a78cdd5b202e17a35ae5d18c520651063cc626b6a70fc1608578b7a88cb33b1a5d5206171e6"

RPROVIDES:${PN} += "libeiskaltdcpp.so.2.4()(64bit) \
libeiskaltdcpp2_4 \
libeiskaltdcpp2_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libidn.so.12()(64bit) \
liblua5.1.so.5()(64bit) \
libminiupnpc.so.17()(64bit) \
libpcrecpp.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
