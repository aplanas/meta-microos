SUMMARY = "Documentation for texlive-kerkis"
DESCRIPTION = "This package includes the documentation for texlive-kerkis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn56271"

RPM_NAME = "texlive-kerkis-doc-2023.209.1.11svn56271-56.1.noarch.rpm"
RPM_HASH = "872a93fe51424bc08e6de8098e33d9ed788035253bb9fbcc28757c3b223734802637d239a9deee25e75d770b4f34998443431508e7acbeaf590545fac3d3f2db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kerkis-doc"

RDEPENDS:${PN} += ""

inherit rpm
