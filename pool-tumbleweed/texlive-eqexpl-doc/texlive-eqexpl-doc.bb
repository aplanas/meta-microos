SUMMARY = "Documentation for texlive-eqexpl"
DESCRIPTION = "This package includes the documentation for texlive-eqexpl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-doc-2023.209.1.1.1svn63629-54.1.noarch.rpm"
RPM_HASH = "a7da2bb3c820491bf78b1fa891729fe78fea7e6e40840837586f50405493c7dc650c674fd1a1358fc5c09038a3c3eafc7246779f656a73cbbd8811c4244c70ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eqexpl-doc-ru \
texlive-eqexpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
