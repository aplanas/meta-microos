SUMMARY = "Linux headers for ppc64le userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for ppc64le, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-ppc64le-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "8d062c3d59e905fabe111823d618298b788cfef33593f73d399553c9690c4a8345ee4ebcf9198170254a0380eea29ef838d7f2d81b920cfe064f89c3d593e6ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64le-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
