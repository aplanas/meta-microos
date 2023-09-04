SUMMARY = "Documentation for texlive-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-ijsra"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44886"

RPM_NAME = "texlive-ijsra-doc-2023.209.1.1svn44886-54.1.noarch.rpm"
RPM_HASH = "05edca5582c08cc8391c7654b1452f442b25191cda0ea9c19d106cc35ab3ad75ccf047e7739fb5adde8bea2cfd3f9108a6a4905d385d476d74b0bc6e358991e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijsra-doc"

RDEPENDS:${PN} += ""

inherit rpm
