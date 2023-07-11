SUMMARY = "Linux headers for s390x userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for s390x, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-s390x-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "2cba52e5bb992ce60d8ba5055f57a463566f632490f16f16b925baf0ac4e54483dcfc6cf9e428b0262fc8084d56f1d82d3d81f21bded3a2d2058abc114a13bc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-s390x-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
