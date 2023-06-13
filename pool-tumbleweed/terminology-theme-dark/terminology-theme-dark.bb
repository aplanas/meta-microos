SUMMARY = "Old default theme for Terminology"
DESCRIPTION = "Old default theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220216.1.26"

RPM_NAME = "terminology-theme-dark-20220216.1.26-1.5.noarch.rpm"
RPM_HASH = "88b9bfd04233712da8f58cfca12ff55883ff2d76f33da9a282eb4f268dfa7fb16d759c3420b96e55eb66448bba2ea6294c5fe91209c1bd51154b183ce21ae17c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-dark"

RDEPENDS:${PN} += "terminology"

inherit rpm
