SUMMARY = "C Library to Deal with Matroska Files"
DESCRIPTION = "Bcmatroska2 is a C library to parse Matroska files (.mkv and .mka)."
LICENSE = "BSD-3-Clause & Zlib & GPL-2.0-or-later"

PV = "5.2.1"

RPM_NAME = "libbcmatroska2-0-5.2.1-1.3.aarch64.rpm"
RPM_HASH = "416883685f1b7a961940e2fbffc11ae25aeb6e187af68adb218de65b2d341e3cd113290c33e5850d203083ca32d9ad5d93c192f9c008df46efe674c7d4f1dbdf"

RPROVIDES:${PN} += "libbcmatroska2-0 \
libbcmatroska2-0(aarch-64) \
libbcmatroska2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbctoolbox.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
