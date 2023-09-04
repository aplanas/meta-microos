SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "cross-riscv64-glibc-devel-2.38-1.1.noarch.rpm"
RPM_HASH = "4a90247c90dd61b7f4e541ee082e705370f6d6ae095aad1c910e387992f1227a23b1242cb64ab90201e669e18c4b022a527c14dfe68b6efea103d0eeeb8cff63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"

RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
