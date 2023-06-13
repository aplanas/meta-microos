SUMMARY = "AV1 video decoding library"
DESCRIPTION = "libgav1 is a Main profile (0) & High profile (1) compliant AV1 decoder written \
in C++ and also offering a C API."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libgav1-1-0.18.0-2.1.aarch64.rpm"
RPM_HASH = "248be200030d2431a481f5864e14779a3523a95f799e92bbfc8fb4a98ee6974d6052b4564157987c6c2f231dc7ee0fae9674894aa3794574d29339d475507980"

RPROVIDES:${PN} += "libgav1-1 \
libgav1-1(aarch-64) \
libgav1.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
