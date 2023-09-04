SUMMARY = "Thrift non-blocking server library"
DESCRIPTION = "Shared library providing the non-blocking server component of the \
Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftnb-0_17_0-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "303e117abfbf600c1447761e831ea3dfe6e47d56bf0f5045b208d1aa7bf1b8cead3ca015fe480098aa2921049093372914de9ab4a351ef0bec8306e3656d7338"

RPROVIDES:${PN} += "libthriftnb-0-17-0 \
libthriftnb-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
