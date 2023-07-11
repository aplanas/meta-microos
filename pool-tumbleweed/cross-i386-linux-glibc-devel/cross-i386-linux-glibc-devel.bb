SUMMARY = "Linux headers for i386 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for i386, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-i386-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "4b51e7711c0f599be119e0e4b566c0ea85e20f634688290721f1ba14051799e192d1350a31b0039da3e5182c88a793ad474b9c9116fbcee8cbd2902e7ad5fcb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-i386-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
