SUMMARY = "Documentation for texlive-bxnewfont"
DESCRIPTION = "This package includes the documentation for texlive-bxnewfont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn44173"

RPM_NAME = "texlive-bxnewfont-doc-2023.201.0.0.2bsvn44173-52.1.noarch.rpm"
RPM_HASH = "712908e0c4a4a578a08d3732bdfdf9080b2d8756508256eb32a535dd46749a56f36f4697e62cf8b84754da9daa96c50e8d431f3e84722231b1cbbbaacbf0e197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxnewfont-doc"
RDEPENDS:${PN} += ""

inherit rpm
