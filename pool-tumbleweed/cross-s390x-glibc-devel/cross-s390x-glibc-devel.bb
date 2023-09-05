SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "cross-s390x-glibc-devel-2.38-2.1.noarch.rpm"
RPM_HASH = "6fca7ab3ad1dedebd6a96fdfd225b653b4d49eca5a1e01accec626c03ffbf8e9c1afa02709fdf6d364923a778de1008bec3378f20122f8749eae1faf3c17f630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-s390x-glibc-devel"

RDEPENDS:${PN} += "cross-s390x-linux-glibc-devel"

inherit rpm
