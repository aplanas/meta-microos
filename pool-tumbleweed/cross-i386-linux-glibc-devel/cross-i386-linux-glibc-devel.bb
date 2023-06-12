SUMMARY = "Linux headers for i386 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for i386, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-i386-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "01ef865b0ac5cc2d187467bea566ce867a350215cdd0d7a6b68c296c94e5cbbd821b8c8d50bfd0971172b56a88634bd94225b0a95a334cedd8e22fb3a0ceb1f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-i386-linux-glibc-devel"
RDEPENDS:${PN} += ""

inherit rpm
