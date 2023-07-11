SUMMARY = "Development headers for libhangul"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libhangul."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1~git20180606.42f7640"

RPM_NAME = "libhangul-devel-0.1.1~git20180606.42f7640-1.16.aarch64.rpm"
RPM_HASH = "e174e1566ad1e6ef393f4ac8635a863e14557ab2f2cd4582d33fb03c0a08251dc8742f5dcf1f9530d2ea1dde32a6494f2002ca82441840f0383114a51e37266f"

RPROVIDES:${PN} += "libhangul-devel \
pkgconfig-libhangul"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhangul1"

inherit rpm
