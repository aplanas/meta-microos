SUMMARY = "Linux headers for riscv64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for riscv64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-riscv64-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "df0a945ef0dc6e3a98f4a11854dea4908ce68dd698df2ea6cdc7250c03b84a6922d305bb32f8f0e675afdd4da23026ea5460e85bb1748df9476056c1310041be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
