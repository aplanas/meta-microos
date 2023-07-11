SUMMARY = "C++ interface for Gwenhywfar"
DESCRIPTION = "This package contains the C++ GUI interface for Gwenhywfar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-cpp79-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "404f80c0ae5ca169f952270dbfa0b69b17fed9c493191c30cc288446f59fda3018facd5a1df7b770600e2ffb5f46402d09a5db8f610a683e072330ee2ab0d59d"

RPROVIDES:${PN} += "libgwengui-cpp.so.79 \
libgwengui-cpp79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
