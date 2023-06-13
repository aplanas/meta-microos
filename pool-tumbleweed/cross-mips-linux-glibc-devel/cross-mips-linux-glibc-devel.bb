SUMMARY = "Linux headers for mips userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for mips, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-mips-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "30e6ef6147b3396cf2fbb86f576925f18d1c8e9e0272473ff5db3e9faf05cc627c446f5739d30c7da59419e23f5c650d769bb45ea0e8cfb56a2384f9f90b92d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-mips-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
