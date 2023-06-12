SUMMARY = "Documentation for texlive-yfonts"
DESCRIPTION = "This package includes the documentation for texlive-yfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn50755"

RPM_NAME = "texlive-yfonts-doc-2023.201.1.4svn50755-52.1.noarch.rpm"
RPM_HASH = "27021f9023e76ed644f1c4e85874684d2eed8abc8b94efe64e88e66cadda4263187e245e675452750884fef815c4445749b2a5913fc8417f5f1e896ff3f52bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
