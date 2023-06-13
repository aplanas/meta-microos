SUMMARY = "A multi-platform, multi-architecture disassembly framework"
DESCRIPTION = "Capstone is a disassembly framework."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "libcapstone4-4.0.2-2.3.aarch64.rpm"
RPM_HASH = "9f83f3be59b0ce030ccf55d022d8dd14b73633728822279ff5824000073fe6794c5601ae008ebe7d7a3dbb4daa4794921d8f64d33d7ff809233c90be88cb61b4"

RPROVIDES:${PN} += "libcapstone.so.4()(64bit) \
libcapstone4 \
libcapstone4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
