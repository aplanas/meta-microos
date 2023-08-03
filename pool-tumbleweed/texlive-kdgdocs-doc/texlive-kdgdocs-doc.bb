SUMMARY = "Documentation for texlive-kdgdocs"
DESCRIPTION = "This package includes the documentation for texlive-kdgdocs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24498"

RPM_NAME = "texlive-kdgdocs-doc-2023.209.1.0svn24498-56.1.noarch.rpm"
RPM_HASH = "848605e4eefd5301cacd7a32fbfbe52df20dd6114dd584d9b672ad04546c22af68600c9a8472c1a08af5b423167899dd6540d558131a4e4f0c4c38308b247594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kdgdocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
