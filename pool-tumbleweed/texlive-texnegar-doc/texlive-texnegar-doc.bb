SUMMARY = "Documentation for texlive-texnegar"
DESCRIPTION = "This package includes the documentation for texlive-texnegar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1esvn57692"

RPM_NAME = "texlive-texnegar-doc-2023.201.0.0.1esvn57692-54.1.noarch.rpm"
RPM_HASH = "b5fa5763e72a289cc5d7066d9a056ccc144d87455f3ad38b851af3d36c863652907424a533c89ab35f1a1506ea51e83838ad9d07ef1b56e152a655f99b917357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texnegar-doc"
RDEPENDS:${PN} += ""

inherit rpm
