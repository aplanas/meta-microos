SUMMARY = "Documentation for texlive-unfonts-core"
DESCRIPTION = "This package includes the documentation for texlive-unfonts-core"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn56291"

RPM_NAME = "texlive-unfonts-core-doc-2023.201.svn56291-53.1.noarch.rpm"
RPM_HASH = "baef7ab7870a6dea24cf88c322618c7f9caaa911debe223c87e28fe07106a34bcf9438963ce17ebff8f6bf4531b85a97121d78383dec0126102766cc22b3ddc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-core-doc"
RDEPENDS:${PN} += ""

inherit rpm
