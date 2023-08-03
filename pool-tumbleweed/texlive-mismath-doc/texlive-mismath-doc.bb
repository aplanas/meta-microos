SUMMARY = "Documentation for texlive-mismath"
DESCRIPTION = "This package includes the documentation for texlive-mismath"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn66391"

RPM_NAME = "texlive-mismath-doc-2023.209.2.7svn66391-55.1.noarch.rpm"
RPM_HASH = "e90dfb9a086dea57f801280852e3578ab1820555ec729441f8abeeb9001e9516e63c69aaadb4a4855452610a926c930af6138376c6411d7c27f6d2edbc0fe10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mismath-doc"

RDEPENDS:${PN} += ""

inherit rpm
