SUMMARY = "Documentation for texlive-opensans"
DESCRIPTION = "This package includes the documentation for texlive-opensans"
LICENSE = "Apache-1.0"

PV = "2023.209.2.2svn54512"

RPM_NAME = "texlive-opensans-doc-2023.209.2.2svn54512-55.1.noarch.rpm"
RPM_HASH = "fddf350b551fdddbc9fbac7bd485bca10350d947fc056ee538e2a7c8517a7b60e10f0902a7d98f58b0a03d55cb7679b55717acddcfd1d9b59cca69f76361f50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opensans-doc"

RDEPENDS:${PN} += ""

inherit rpm
