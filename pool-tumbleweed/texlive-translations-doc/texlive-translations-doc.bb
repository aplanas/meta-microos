SUMMARY = "Documentation for texlive-translations"
DESCRIPTION = "This package includes the documentation for texlive-translations"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn61896"

RPM_NAME = "texlive-translations-doc-2023.201.1.12svn61896-52.1.noarch.rpm"
RPM_HASH = "563571701cefe3a36a2f38da4ff9b7cc1b9cf5b3d00ecab6804e8ea3408b43757198118fa6a6ee260e3d0d08a01c962b9a4f2400c79cd8365d340677981a0b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-translations-doc-en \
texlive-translations-doc"

RDEPENDS:${PN} += ""

inherit rpm
