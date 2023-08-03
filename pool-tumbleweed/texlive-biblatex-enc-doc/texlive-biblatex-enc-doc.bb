SUMMARY = "Documentation for texlive-biblatex-enc"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-enc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44627"

RPM_NAME = "texlive-biblatex-enc-doc-2023.209.1.0svn44627-54.1.noarch.rpm"
RPM_HASH = "ea860e2d4ad0af6a7fd255b9290addb0575f6384e9f5100e290d0f146635f7d55ab307d48027edf6bd904b89a708540b66b95932a4f847dba25fd9d9c2b5d408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-enc-doc"

RDEPENDS:${PN} += ""

inherit rpm
