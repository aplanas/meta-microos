SUMMARY = "Documentation for texlive-bigints"
DESCRIPTION = "This package includes the documentation for texlive-bigints"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-bigints-doc-2023.209.svn29803-54.1.noarch.rpm"
RPM_HASH = "dd0fa66af5347f5d25617e6c5ea7c7982fc0ffc2160bcdb1c1ce044cafb3831908d2742e0aafbfaa9e1b38cf647870b3a60668e1ba88a294d01a4fbc1e89d11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigints-doc"

RDEPENDS:${PN} += ""

inherit rpm
