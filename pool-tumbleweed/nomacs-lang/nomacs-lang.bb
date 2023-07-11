SUMMARY = "Translations for package nomacs"
DESCRIPTION = "Provides translations for the 'nomacs' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.16.224"

RPM_NAME = "nomacs-lang-3.16.224-2.23.noarch.rpm"
RPM_HASH = "9d03ee8eadaacb421d1399842919d3d40ecdc8c23caed500b2573a3b9983214864f524d3a8f1b5c2c325b1dbe0180ac7e111dc9abcadd1fecc5ba80bf5523254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nomacs-lang \
nomacs-lang-all"

RDEPENDS:${PN} += "nomacs"

inherit rpm
