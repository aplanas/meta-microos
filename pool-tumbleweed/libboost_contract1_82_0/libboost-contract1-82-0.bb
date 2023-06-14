SUMMARY = "Boost.Contract runtime library"
DESCRIPTION = "Runtime support for Boost.Contract, a library that implements \
Design by Contract or DbC or contract programming."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_contract1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "9505ae2c8629447e625a058adb0c871bb51fb4040037795a00ec2431b1b5fe8fa2424068bc42486ad3023d7b93f09c334bfbcc4c66daf29fe4376babf5a583fc"

RPROVIDES:${PN} += "libboost-contract.so.1.82.0 \
libboost-contract1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
