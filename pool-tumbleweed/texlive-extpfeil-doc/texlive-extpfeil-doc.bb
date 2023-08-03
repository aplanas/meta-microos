SUMMARY = "Documentation for texlive-extpfeil"
DESCRIPTION = "This package includes the documentation for texlive-extpfeil"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn16243"

RPM_NAME = "texlive-extpfeil-doc-2023.209.0.0.4svn16243-53.1.noarch.rpm"
RPM_HASH = "7ff19efb5847b84092ccde3484875cef77baf9cccc5d183849e1817223f4873825743324e2c555100cbf3b5f1b73fe4914bf8d7d970ca1cb78380f2c69142f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-extpfeil-doc-de \
texlive-extpfeil-doc"

RDEPENDS:${PN} += ""

inherit rpm
