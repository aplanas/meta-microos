SUMMARY = "Documentation for texlive-foekfont"
DESCRIPTION = "This package includes the documentation for texlive-foekfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-foekfont-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "bad0b86f34c0667351aa187222685add85fe7f77e8f8fcd60986ed05a08fb5d056057dc795d7005c9ff79fff4875da32d6e50b20ae40f7e85847a2d12377436c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foekfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
