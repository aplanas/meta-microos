SUMMARY = "Documentation for texlive-attachfile"
DESCRIPTION = "This package includes the documentation for texlive-attachfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn42099"

RPM_NAME = "texlive-attachfile-doc-2023.209.1.9svn42099-54.1.noarch.rpm"
RPM_HASH = "9b9b6ea3c801fd802862547173557cb08393ebf9767e6dba399cfbe5c8acda2d68ce80bc4258caa7e0ee90853247c97651e26e2cd986fe1bce2b532bb48f7b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-attachfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
