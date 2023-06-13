SUMMARY = "Linux headers for m68k userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for m68k, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-m68k-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "cfdd608c3de2f516792aaf56189fa4a9bbf17ccf0de0a564dec618ffb40ff5d74ee5158be6a38d77d17a061b6beb4efc3c010600dde6f4e6db12c1b7644432b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-m68k-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
