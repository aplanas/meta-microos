SUMMARY = "Development files for libnfs"
DESCRIPTION = "The libnfs-devel package contains libraries and header files for \
developing applications that use libnfs."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "libnfs-devel-5.0.2-1.4.aarch64.rpm"
RPM_HASH = "8c3099a564f14577ec51719a3035a3e85891c475ea75813552bd6546eb8fb8276928ed745b2e8971b560e7b580406d3845f4dde271efa0082c0ba86e3050571c"

RPROVIDES:${PN} += "libnfs-devel \
pkgconfig-libnfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfs14"

inherit rpm
