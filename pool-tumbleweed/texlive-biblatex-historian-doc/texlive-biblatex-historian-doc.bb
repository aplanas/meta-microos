SUMMARY = "Documentation for texlive-biblatex-historian"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-historian"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn19787"

RPM_NAME = "texlive-biblatex-historian-doc-2023.209.0.0.4svn19787-54.1.noarch.rpm"
RPM_HASH = "12c39f5edec1f0a2eafe84eb521282813f29bf8ab90494e8542b2584ec88dd584b200b73f4eb6936704a48f729f2dbb4331d9b76032d496d88a035c52cc28e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-historian-doc"

RDEPENDS:${PN} += ""

inherit rpm
