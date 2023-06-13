SUMMARY = "Library for accessing the Secret Service API"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "libsecret-1-0-0.20.5-1.7.aarch64.rpm"
RPM_HASH = "b89a45eaa371f5037d95493c5404a107ce136cffbd9989b62a3de082f7c0f21add2c3513f8032e53fd70a4b649dc51c334ff5f9611dcb918949ec98a883aa1fd"

RPROVIDES:${PN} += "libsecret \
libsecret-1-0 \
libsecret-1-0(aarch-64) \
libsecret-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
