SUMMARY = "Documentation for texlive-gs1"
DESCRIPTION = "This package includes the documentation for texlive-gs1"
LICENSE = "LPPL-1.0"

PV = "2023.201.23svn59620"

RPM_NAME = "texlive-gs1-doc-2023.201.23svn59620-53.2.noarch.rpm"
RPM_HASH = "fea05713a20a0119790e21d0c20d1defb6c92d2dbd9a7a1786d326a9081dfe3865ce0aeb04be9fa6e5e6c0b4c18676080ad51baa401c9c9978777a1248a1aea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gs1-doc"

RDEPENDS:${PN} += ""

inherit rpm
