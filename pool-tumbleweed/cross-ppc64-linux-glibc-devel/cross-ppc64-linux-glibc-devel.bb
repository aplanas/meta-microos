SUMMARY = "Linux headers for ppc64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for ppc64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-ppc64-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "43243b093cea0b691a914dc05b180fae65e0e98ca91aa443b1116d15d3f68115d72253d10f1b94c5fe9d0bb7952a256ffe48ec957098d87da3ba6f656cc65a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
