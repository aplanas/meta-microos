SUMMARY = "Thrift Zlib API"
DESCRIPTION = "A shared library from the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftz-0_17_0-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "b709910260723d09459f100e14805f67e2d35207d952535caeb2a37f894b4a4d4c38978e884a3dd1924ac6ca6fc23fe405eadb6086a1b9798df2564fcb9e3251"

RPROVIDES:${PN} += "libthriftz-0-17-0 \
libthriftz-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
