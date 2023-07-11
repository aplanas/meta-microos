SUMMARY = "A multi-platform, multi-architecture disassembly framework"
DESCRIPTION = "Capstone is a disassembly framework."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "libcapstone4-4.0.2-2.4.aarch64.rpm"
RPM_HASH = "316d9537ee3bee8e1d65fee041bedf1c989d2f88f6ac7615a5e8231fbaa6245b4b9f731571bb6508c9b2c6fa22ddd04c5db0048f935375d240de3b7bb0a1f8da"

RPROVIDES:${PN} += "libcapstone.so.4 \
libcapstone4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
