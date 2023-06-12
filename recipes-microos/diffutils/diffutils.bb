SUMMARY = "GNU diff Utilities"
DESCRIPTION = "The GNU diff utilities find differences between files. diff is used to \
make source code patches, for instance."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.10"

RPM_NAME = "diffutils-3.10-1.1.aarch64.rpm"
RPM_HASH = "723bc09c5700c1c4af026fc80958b3ad4bc0432dc8c3ce3ad27b483dbd70afb00325924bca9f5213e8a471a86805bb08f1a36696073f700989ffea8f76253217"

RPROVIDES:${PN} += "diff \
diffutils \
diffutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
