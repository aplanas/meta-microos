SUMMARY = "Documentation for texlive-graphicxpsd"
DESCRIPTION = "This package includes the documentation for texlive-graphicxpsd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-doc-2023.201.1.2svn57341-53.2.noarch.rpm"
RPM_HASH = "7ce43f037bf3bad31416537d140d0886ffed44fb03ff9db0cecc52f412fdf9b01e5ee8264cb26ec8ce48489b49484749ac0def6ac59362dff4e120ff13355753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxpsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
