SUMMARY = "Documentation for texlive-greektonoi"
DESCRIPTION = "This package includes the documentation for texlive-greektonoi"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn39419"

RPM_NAME = "texlive-greektonoi-doc-2023.201.svn39419-53.1.noarch.rpm"
RPM_HASH = "1977141b6ed86970cf43215954605c44f995fb9bb23f8a438a2c4c24f5ebda20954d6da9a704fe881e55767facc823294f5e0c25e0b42157da4a0cb07f0a0a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektonoi-doc-el \
texlive-greektonoi-doc"

RDEPENDS:${PN} += ""

inherit rpm
