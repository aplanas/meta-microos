SUMMARY = "Thrift Zlib API"
DESCRIPTION = "A shared library from the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftz-0_17_0-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "78dcdc633c9d0f6a85b9d8bbcf9f0b3e3b9092e0fc18d8ae05b60681f301a197a5ebcff402faac5662b9db676acf9c0adf963259249e0c2c73a8c1181b9fbe19"

RPROVIDES:${PN} += "libthriftz-0-17-0 \
libthriftz-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
