SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "cross-riscv64-glibc-devel-2.37-5.1.noarch.rpm"
RPM_HASH = "bbec5a2f4c22ae17caf90ff76dd0264f5e7a29383eb26d2a77498e5a8e52f4438416715da4a05d1818026f548f1582cc842bce91526f722705239cc26deec823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"

RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
