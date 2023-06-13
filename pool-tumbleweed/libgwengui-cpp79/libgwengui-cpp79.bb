SUMMARY = "C++ interface for Gwenhywfar"
DESCRIPTION = "This package contains the C++ GUI interface for Gwenhywfar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-cpp79-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "c671f96b5954ce487ef5ebdd475dbc88812ffeca4b846963ec1675a54c626dbb121d96bdb47993211648c4757bf43660d05ff9b75af7de50ec9ca65fa8714929"

RPROVIDES:${PN} += "libgwengui-cpp.so.79()(64bit) \
libgwengui-cpp79 \
libgwengui-cpp79(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgwenhywfar.so.79()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
