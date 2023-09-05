SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "cross-riscv64-glibc-devel-2.38-2.1.noarch.rpm"
RPM_HASH = "ad5abdb1129c65d863f7da4238059cb2797c324d99ed49a2458a03a379831256f1f9609d7473d8a46e42564b418704d1bf3dac501032bcfd02f9f340a176af27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"

RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
