SUMMARY = "Format manual pages"
DESCRIPTION = "The mandoc utility formats manual pages for display. \
 \
It is split out from the mandoc package as it can be useful \
even without replacing the entire man infrastructure."
LICENSE = "ISC"

PV = "1.14.6"

RPM_NAME = "mandoc-bin-1.14.6-3.3.aarch64.rpm"
RPM_HASH = "8addd90538c19fa0c669886f710db079528441c047d3daf44dbd039d71b012b98314623ee55227cd40b68bb177e68a718cf92c0f8d5d0a3468e1f978437b8d3f"

RPROVIDES:${PN} += "mandoc-bin \
mandoc-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
