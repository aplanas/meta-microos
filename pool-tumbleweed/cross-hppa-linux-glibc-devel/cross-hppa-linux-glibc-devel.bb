SUMMARY = "Linux headers for hppa userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for hppa, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-hppa-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "04bf7c99aa2be7f6dfcae0e88470bbcaf0fa4c6cdeab5d7d6393e4e2413e48d705e4d30e04a3c1e2b4c4c4057e4fe164d66241936b5edc5bfb1806ef69a0336e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-hppa-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
