SUMMARY = "Development files for cal3d"
DESCRIPTION = "This package contains libraries, include files, and other resource \
you can use to develop applications using animated characters with \
cal3d."
LICENSE = "LGPL-2.1+"

PV = "0.120"

RPM_NAME = "cal3d-devel-0.120-3.10.aarch64.rpm"
RPM_HASH = "a294e79fe286a4848b928aac0f8b4a046e9a16b555643f28bd2e9bae2ec8f7a9cb0ff6407de434ade482c5a9782c24c6ea9defe89f86ae3c9fd3a759b9f538a7"

RPROVIDES:${PN} += "cal3d-devel \
cal3d-devel(aarch-64) \
pkgconfig(cal3d)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcal3d12"

inherit rpm
