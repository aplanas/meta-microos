SUMMARY = "Library with functions commonly found on BSD systems"
DESCRIPTION = "This library provides functions commonly found on BSD systems, and \
lacking on others like GNU systems, thus making it easier to port projects \
with strong BSD origins, without needing to embed the same code over and \
over again on each project."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd0-0.11.7-2.1.aarch64.rpm"
RPM_HASH = "f9f76644c15be1038153cfb5c1dc9b48b06680120303bab2123d409f59d45d1f53237ebd5be8d07a4bd5bc5ffabc6838eac1fec639ab0dbfb97cb475c5bf1222"

RPROVIDES:${PN} += "libbsd.so.0()(64bit) \
libbsd0 \
libbsd0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmd.so.0()(64bit)"

inherit rpm
