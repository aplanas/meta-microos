SUMMARY = "Documentation for texlive-doulossil"
DESCRIPTION = "This package includes the documentation for texlive-doulossil"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.1svn63255"

RPM_NAME = "texlive-doulossil-doc-2023.209.0.0.1svn63255-53.1.noarch.rpm"
RPM_HASH = "89c8ab5d688c2da67db7b4836a77ab748fc3b47d14de074d73d22f01471a4901520699f9f0b5e09f71f588dba945da81161b528772782fa9762324d23fdbec8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doulossil-doc"

RDEPENDS:${PN} += ""

inherit rpm
