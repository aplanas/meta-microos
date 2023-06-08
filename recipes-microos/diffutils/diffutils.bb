SUMMARY = "GNU diff Utilities"
DESCRIPTION = "The GNU diff utilities find differences between files. diff is used to \
make source code patches, for instance."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.9"

RPM_NAME = "diffutils-3.9-1.3.aarch64.rpm"
RPM_HASH = "bb7f5bd1e58bbf7092c237e69e025742d9c7da4e20e5e9903d4c117441e08f093246892010d95ce003010421e310b4e1fa95a54ba5c860a53f2d0589d216b86f"

RPROVIDES:${PN} += "diff diffutils diffutils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
