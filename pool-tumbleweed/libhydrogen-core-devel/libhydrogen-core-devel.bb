SUMMARY = "Development files and headers for libhydrogen-core"
DESCRIPTION = "These are the headers needed to develop apps that \
link with libhydrogen-core."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "libhydrogen-core-devel-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "f6e29ca2e489e04f52fa3d0059bca8f6ad91d19844c58b433eb3d864128e12503c3a4bd58663476752f769551022b0692e54498955c64c2773b211ee95e79018"

RPROVIDES:${PN} += "libhydrogen-core-devel"

RDEPENDS:${PN} += "libhydrogen-core-1-2-1"

inherit rpm
