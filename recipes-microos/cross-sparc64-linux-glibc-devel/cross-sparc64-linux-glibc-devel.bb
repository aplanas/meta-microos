SUMMARY = "Linux headers for sparc64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for sparc64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-sparc64-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "e97f187166c18c369451c4919c5715031fe98dc736e52112c774f6de5edb4f4b96b96f9e5acdee469797022ac4ed47ce8f469a6014b4c4bfe59f97ed040b10ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-sparc64-linux-glibc-devel"
RDEPENDS:${PN} += ""

inherit rpm
