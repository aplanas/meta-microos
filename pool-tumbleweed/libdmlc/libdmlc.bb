SUMMARY = "Distributed Machine Learning Common Codebase"
DESCRIPTION = "DMLC-Core is the backbone library to support all DMLC projects, offers the bricks to build efficient and scalable distributed machine learning libraries."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "libdmlc-0.5-1.8.aarch64.rpm"
RPM_HASH = "b84cd8a1b55a484bed52e432be4f689bedf01d46f7e566961085640a4e44dcad601e5b2e3a1c25e2ba1dc5349d1979046ae031a81265f33c4eb21d8644dcd296"

RPROVIDES:${PN} += "libdmlc \
libdmlc(aarch-64) \
libdmlc.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
