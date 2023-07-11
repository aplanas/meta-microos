SUMMARY = "Linux headers for sparc64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for sparc64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-sparc64-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "53f4fc1b808f125c1fb002a7cfd059ac04aace446cf446e21f3c2e144e80b157c0ca9e84c018e72f20069b7e158786091e17f4d651f2ae6b77159738929700c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-sparc64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
