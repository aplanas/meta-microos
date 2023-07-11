SUMMARY = "Linux headers for aarch64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for aarch64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-aarch64-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "6864459576188205c30d6189294b1598d19414e2afae33611d1c1418abd72d2be718401a619160a39598affc9b6f50b4204f94cff678e439f9263ac771380b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-aarch64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
