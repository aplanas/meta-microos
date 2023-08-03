SUMMARY = "Documentation for texlive-letltxmacro"
DESCRIPTION = "This package includes the documentation for texlive-letltxmacro"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53022"

RPM_NAME = "texlive-letltxmacro-doc-2023.209.1.6svn53022-55.1.noarch.rpm"
RPM_HASH = "918af695babe749e85c2b9fa60b4bae45eaeca24a5e8ae23712a3f8b55ebbef34c1b29612c79225e31869ad1ebd9607c6c15557135775aba3cfb7a43277de76e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-letltxmacro-doc-en \
texlive-letltxmacro-doc"

RDEPENDS:${PN} += ""

inherit rpm
