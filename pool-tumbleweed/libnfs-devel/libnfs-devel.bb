SUMMARY = "Development files for libnfs"
DESCRIPTION = "The libnfs-devel package contains libraries and header files for \
developing applications that use libnfs."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "libnfs-devel-5.0.2-1.5.aarch64.rpm"
RPM_HASH = "f4b4b098f5b43def0730d11a630bf7262767ae6a826743bd8d026870a223885576d23a6bbae3323b4b84f630cbed74d053741cf07630074eae7f12889896782d"

RPROVIDES:${PN} += "libnfs-devel \
pkgconfig-libnfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfs14"

inherit rpm
