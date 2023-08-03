SUMMARY = "Documentation for texlive-langcode"
DESCRIPTION = "This package includes the documentation for texlive-langcode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn27764"

RPM_NAME = "texlive-langcode-doc-2023.209.0.0.2svn27764-56.1.noarch.rpm"
RPM_HASH = "8e02f4579416d748ed0799afa9492f351a9aa66b05155db0db3a8df4c85a5489ee1df9454cb18639c8e7c90436669e66a4ed4b6929e6c663ec8d3c74abb3d81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
