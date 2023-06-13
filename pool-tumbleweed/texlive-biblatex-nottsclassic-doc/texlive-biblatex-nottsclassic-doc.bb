SUMMARY = "Documentation for texlive-biblatex-nottsclassic"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nottsclassic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41596"

RPM_NAME = "texlive-biblatex-nottsclassic-doc-2023.201.0.0.1svn41596-53.1.noarch.rpm"
RPM_HASH = "05999eaad2304452961b38b17595421c93d712506281194f80c136014bc786024310e0b99b25c23771509482e13b8eedcc77f8f80766798529552334c16b2521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nottsclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
