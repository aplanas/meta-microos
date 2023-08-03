SUMMARY = "Documentation for texlive-chemcono"
DESCRIPTION = "This package includes the documentation for texlive-chemcono"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn17119"

RPM_NAME = "texlive-chemcono-doc-2023.209.1.3svn17119-54.1.noarch.rpm"
RPM_HASH = "c048b796981fe4c1fe78136ee0733bbd26a91e306a18374876ffeb6cc62ca41ebdef1abedfdf2d763aa0445a260ed286c3f81b03cdd711c367e3d98b213e9566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemcono-doc"

RDEPENDS:${PN} += ""

inherit rpm
