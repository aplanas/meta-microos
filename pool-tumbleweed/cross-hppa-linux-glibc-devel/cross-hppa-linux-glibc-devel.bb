SUMMARY = "Linux headers for hppa userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for hppa, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-hppa-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "6142a005e508fa33c9c0eddbd453d33c9bae02b53bac5e7b560bb382898c7b30232e2fe87d9c77c6a32eb967a830b54a06445c90afa9403f32e5139abbbc251b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-hppa-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
