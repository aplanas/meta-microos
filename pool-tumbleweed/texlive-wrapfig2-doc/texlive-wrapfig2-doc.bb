SUMMARY = "Documentation for texlive-wrapfig2"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig2"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-doc-2023.201.6.1.1svn66115-52.1.noarch.rpm"
RPM_HASH = "47bce29183790b116789b29cc5726ddff16e62549a0577590f67ceb81497c04cd103899ac62a94bae1181a5a6412c4e92d14d1fe738899bdf4a7158ac6dfe704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig2-doc"
RDEPENDS:${PN} += ""

inherit rpm
