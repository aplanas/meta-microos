SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmbox-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "21dbefff2f3b4d85749ad9903fd539de93011570e985e958ccdea036248dffb2a2616a3c4c468541909aaa96cedd73f11b57254bb1ae3d3a494311b92d65f577"

RPROVIDES:${PN} += "kmbox \
kmbox(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
