SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "cross-riscv64-glibc-devel-2.37-3.1.noarch.rpm"
RPM_HASH = "97530aa36ef8bb9c6c92f0ccf523522dd6264516e5bc50f6366fb693d7b44154ae198c3c219d55867465e39fbd4b08973fcd48769979d1838b84026b750b0807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"
RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
