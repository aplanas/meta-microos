SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "cross-riscv64-glibc-devel-2.37-4.1.noarch.rpm"
RPM_HASH = "edc24f289841070047471ab38c1e3c7a4abd480ede06466747cfae138c66bb7f660b799c8735ee1a985054c0dfd4ac798b71162c61de2d8973307c1a56e0fcc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"

RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
