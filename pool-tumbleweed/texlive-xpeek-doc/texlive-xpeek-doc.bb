SUMMARY = "Documentation for texlive-xpeek"
DESCRIPTION = "This package includes the documentation for texlive-xpeek"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-doc-2023.209.0.0.2svn61719-53.2.noarch.rpm"
RPM_HASH = "0ea6b22ef9cfc38d9c61e043b15aa71144d0c9650437447fa85b712ee506f525b99e6d1c657d86ef956d24b98d63b7e06be9ae3dbb41d9eb9fa185a7aca62423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpeek-doc"

RDEPENDS:${PN} += ""

inherit rpm
