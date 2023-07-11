SUMMARY = "Development files for libmdmp"
DESCRIPTION = "libmdmp is a library to access the Windows Minidump (MDMP) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmdmp."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-devel-20210420-3.5.aarch64.rpm"
RPM_HASH = "6b18133a0b8ac2fa3791c6548a325369314918cc88cf9edd52e1f24a9cb6f7b7df045dab753738485f0fd934ed24a11c69283b83491934bb518648cf6dce907b"

RPROVIDES:${PN} += "libmdmp-devel \
pkgconfig-libmdmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmdmp1"

inherit rpm
