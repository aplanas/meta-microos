SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "cross-ppc64le-glibc-devel-2.38-2.1.noarch.rpm"
RPM_HASH = "801c6dac662845a97309625f6533544d42398c9574fa7f82b19f16a513ea33fb2eed14a9bd667f4455db3a6e8f9a597e8302c0cab26cc06de7d2ddce6435d545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64le-glibc-devel"

RDEPENDS:${PN} += "cross-ppc64le-linux-glibc-devel"

inherit rpm
