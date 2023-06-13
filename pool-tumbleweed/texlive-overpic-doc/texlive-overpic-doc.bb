SUMMARY = "Documentation for texlive-overpic"
DESCRIPTION = "This package includes the documentation for texlive-overpic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53889"

RPM_NAME = "texlive-overpic-doc-2023.201.1.3svn53889-51.1.noarch.rpm"
RPM_HASH = "0db91ab8d5de9625dfb5cbe07f6e457f49d56db5c27eefc4635ebebab06cdee1e3e210fc05d4d58afa40f48534ebf526c0bfc0b71ab0b9e764585213ac96e695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-overpic-doc:de;en) \
texlive-overpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
