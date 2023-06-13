SUMMARY = "An EPUB generator library"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-0_1-1-0.1.1-1.21.aarch64.rpm"
RPM_HASH = "f72516911b3aeb3cfd0d2fa9ffe8768340cd3fd7429cce8f7784ed80497d5d2a90df85657574d0d36cc1aabfeacb876f231f1e88fcd987139b364da35a287be1"

RPROVIDES:${PN} += "libepubgen-0.1.so.1()(64bit) \
libepubgen-0_1-1 \
libepubgen-0_1-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
