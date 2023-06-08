SUMMARY = "Linux headers for riscv64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for riscv64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-riscv64-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "1b59404124f7da03f5c23f0a1c5364c9b499b5a5e196bf9f3fe8e010bff429630509dcdca21dbcda2921b42dcd27cb5c63f857466d7fa5ded1458ff09d648c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-linux-glibc-devel"
RDEPENDS:${PN} += ""

inherit rpm
