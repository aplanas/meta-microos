SUMMARY = "Linux headers for arm userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for arm, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-arm-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "b4398ed7a13e83601a2ffc9e0ed0b4c59d3f5e15edf45d432ee1daac6199c61f68bf910a25a0849585f7eb74cff2e0cac06bbee8c70fce55abd8677522a6b9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-arm-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
