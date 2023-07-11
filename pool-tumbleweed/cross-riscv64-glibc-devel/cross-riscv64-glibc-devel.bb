SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "cross-riscv64-glibc-devel-2.37-4.4.noarch.rpm"
RPM_HASH = "3c9a14933609ba9e97f1f0baeee42bfd111822f4db5276129825fae56d2b8a5f84e1010bc8922cbd50627389ff3e06ff68ce664b481dad764bc9dbc60aba18d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-glibc-devel"

RDEPENDS:${PN} += "cross-riscv64-linux-glibc-devel"

inherit rpm
