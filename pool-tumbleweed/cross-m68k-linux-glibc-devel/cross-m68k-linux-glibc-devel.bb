SUMMARY = "Linux headers for m68k userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for m68k, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-m68k-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "34c9601c575764d3d50f558c518821cc63aa927b901c68642af3260bd728a8c5daea09c46cf1622ed6341404122d9570291de51fd2d3bda878ce137ac960d0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-m68k-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
