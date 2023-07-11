SUMMARY = "Documentation for texlive-xstring"
DESCRIPTION = "This package includes the documentation for texlive-xstring"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.85svn65551"

RPM_NAME = "texlive-xstring-doc-2023.201.1.85svn65551-52.2.noarch.rpm"
RPM_HASH = "2b4a0e2101cb0c5e5ad521b750c186fab5d077ad966f902b2164f887fdacb90a9eb41b88dcc429af4f09a238da3894a05d0083e96eee6f3eae848ee56684c700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xstring-doc-en;fr \
texlive-xstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
