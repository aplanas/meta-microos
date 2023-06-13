SUMMARY = "XSL Processor"
DESCRIPTION = "Sablotron is an XSL processor fully implemented in C++. The excellent \
Expat parser is used as the associated XML parser."
LICENSE = "GPL-2.0+"

PV = "1.0.3"

RPM_NAME = "sablot-1.0.3-130.28.aarch64.rpm"
RPM_HASH = "d616a944e380e4a3469fcc55c162f9812a7f221dbe65d2a3d582a30e2a9c91540c178f5a3639a10fae8f31353f68f21222b104127e18e9ff4ed7a6b9b6367bdd"

RPROVIDES:${PN} += "libsablot.so.0()(64bit) \
sablot \
sablot(aarch-64) \
sablotron"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.35)(64bit) \
libexpat.so.1()(64bit)"

inherit rpm
