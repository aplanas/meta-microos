SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the Valgrind header files."
LICENSE = "GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "valgrind-devel-3.21.0-2.1.aarch64.rpm"
RPM_HASH = "71d6fb36ba19fc8328565d048d1f90161d57d812d78432bb498f87c1273e7639f432c0c52960c716ed565d5e6b2edcc1b76bfa942393e5b4f2b494f313b43358"

RPROVIDES:${PN} += "pkgconfig-valgrind \
valgrind-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
valgrind \
valgrind-client-headers"

inherit rpm
