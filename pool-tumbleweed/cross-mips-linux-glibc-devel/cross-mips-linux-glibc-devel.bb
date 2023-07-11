SUMMARY = "Linux headers for mips userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for mips, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-mips-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "7e5b19a72ae0194e59246b4f3e1ca13ec932d77110dfd0550d3f2360124088c65ce9e202102fe172869a957d6390977a0492c7cf1f6a1a8ab40fac4e8a943ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-mips-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
