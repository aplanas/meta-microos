SUMMARY = "GNU uCommon Runtime library for portable C++ threading and sockets"
DESCRIPTION = "GNU uCommon C++ is a lightweight library to facilitate using C++ \
design patterns even for very deeply embedded applications, such as \
for systems using uClibc along with POSIX threading support. For this \
reason, uCommon disables language features that consume memory or \
introduce runtime overhead. uCommon introduces some design patterns \
from Objective-C, such as reference counted objects, memory pools, \
and smart pointers. uCommon introduces some new concepts for handling \
of thread locking and synchronization."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "libucommon8-7.0.1-1.10.aarch64.rpm"
RPM_HASH = "87d1c5ce6e45cfccf617150feb66d2054fb143ee0f9b5aea8786d597e8ee80ac39df620ec8d082351284786df8a42a4b435a5c9947c91542d4e96c42e48c8b83"

RPROVIDES:${PN} += "libcommoncpp.so.8 \
libucommon.so.8 \
libucommon8 \
libusecure.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
