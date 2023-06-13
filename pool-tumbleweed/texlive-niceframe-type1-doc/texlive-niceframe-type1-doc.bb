SUMMARY = "Documentation for texlive-niceframe-type1"
DESCRIPTION = "This package includes the documentation for texlive-niceframe-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44671"

RPM_NAME = "texlive-niceframe-type1-doc-2023.201.svn44671-54.1.noarch.rpm"
RPM_HASH = "c8672e71fb01c8fa2eae7a5ffc0b20bc7e027a4ff0f5dc1a434d3d52d901ad5dd721f4d6b437916e988f782e2b7fbb2316287ad27c6befff065d1965d77ea2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-niceframe-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
