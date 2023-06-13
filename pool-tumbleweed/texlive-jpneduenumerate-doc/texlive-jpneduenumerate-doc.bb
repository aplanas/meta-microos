SUMMARY = "Documentation for texlive-jpneduenumerate"
DESCRIPTION = "This package includes the documentation for texlive-jpneduenumerate"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn63893"

RPM_NAME = "texlive-jpneduenumerate-doc-2023.201.1.2svn63893-55.1.noarch.rpm"
RPM_HASH = "399966e3119d3afa9234cc7b239d71ab3afd217b24f98f302b09def1bd1fb0d7d8562627c42eee9e85021d71532b4ce75593cf96d1191a6d871ebdee0623a9af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-jpneduenumerate-doc:en \
texlive-jpneduenumerate-doc"

RDEPENDS:${PN} += ""

inherit rpm
