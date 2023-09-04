SUMMARY = "Documentation for texlive-xecjk"
DESCRIPTION = "This package includes the documentation for texlive-xecjk"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-doc-2023.209.3.9.1svn64059-53.2.noarch.rpm"
RPM_HASH = "df765f365947622201dc98bc9192f9cebee64ed2df7dabfc7ada49b681ce5c07c5ac375bc2e4d69a20ec85ae07fc039a0e0f312e1b648c68fc971e06b2b33e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecjk-doc-zh \
texlive-xecjk-doc"

RDEPENDS:${PN} += ""

inherit rpm
