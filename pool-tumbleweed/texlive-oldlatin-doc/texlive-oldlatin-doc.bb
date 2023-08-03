SUMMARY = "Documentation for texlive-oldlatin"
DESCRIPTION = "This package includes the documentation for texlive-oldlatin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn17932"

RPM_NAME = "texlive-oldlatin-doc-2023.209.1.00svn17932-55.1.noarch.rpm"
RPM_HASH = "a0c129ce25b85a90dbaf28ba098556cd6e80e1d9a34d1554d5ba7606820d6e73ce0cda97223ffb5d5ef69e0841c9d637977d41088575132009f37ac14e6b21b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldlatin-doc"

RDEPENDS:${PN} += ""

inherit rpm
