SUMMARY = "Documentation for texlive-engtlc"
DESCRIPTION = "This package includes the documentation for texlive-engtlc"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn28571"

RPM_NAME = "texlive-engtlc-doc-2023.201.3.2svn28571-53.2.noarch.rpm"
RPM_HASH = "1fd4d34809e781ce8f1932ee04e6439aa00e11a5c2a90403a1c6a61859d21220ebbd3848ad00f1e59b0bd8c27d70130ccebc6f0a0ff5ef0d98c1ca3932411bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engtlc-doc-en;it \
texlive-engtlc-doc"

RDEPENDS:${PN} += ""

inherit rpm
