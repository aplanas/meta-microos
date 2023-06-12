SUMMARY = "Documentation for texlive-cheatsheet"
DESCRIPTION = "This package includes the documentation for texlive-cheatsheet"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn45069"

RPM_NAME = "texlive-cheatsheet-doc-2023.201.0.0.8svn45069-53.1.noarch.rpm"
RPM_HASH = "9f9304d15b5f979b6e23c1a8238a895fcd8da96275db5b76945d22fc85600a158f8d5b6cb488ff32a6feec2e54e4f770b2f762c239b5ed327d82cf54e86e6281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cheatsheet-doc"
RDEPENDS:${PN} += ""

inherit rpm
