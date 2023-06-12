SUMMARY = "Documentation for texlive-unfonts-extra"
DESCRIPTION = "This package includes the documentation for texlive-unfonts-extra"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn56291"

RPM_NAME = "texlive-unfonts-extra-doc-2023.201.svn56291-53.1.noarch.rpm"
RPM_HASH = "3a394a4d68309e814f3f19883b9f2fcdaafb2888d972b328cc0872689fea0f1b971f9b93d0cddf63a8f8bd52c8ad101693ac64b5d999a9bf0dae687b57c70d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-extra-doc"
RDEPENDS:${PN} += ""

inherit rpm
