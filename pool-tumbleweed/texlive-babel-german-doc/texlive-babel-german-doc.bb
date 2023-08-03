SUMMARY = "Documentation for texlive-babel-german"
DESCRIPTION = "This package includes the documentation for texlive-babel-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.13svn57978"

RPM_NAME = "texlive-babel-german-doc-2023.209.2.13svn57978-54.1.noarch.rpm"
RPM_HASH = "41ebbfc3420ba80c7579bda49ca4943225b800b7ebbebc4ef3af1f1572869ff1f6f7c0e2540bd1a4496b89d3f07ac5655e25496d9756e411d307a4ba40dc4ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
