SUMMARY = "Documentation for texlive-aiaa"
DESCRIPTION = "This package includes the documentation for texlive-aiaa"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn15878"

RPM_NAME = "texlive-aiaa-doc-2023.201.3.6svn15878-54.1.noarch.rpm"
RPM_HASH = "213bfe735a1fa16989e6e2f48b504e650ba60b464f2264a12a6d468508ea79a68efa5321ae62a947d8f5a42e45015b0156364a9491302cae49a684eebc3f71f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aiaa-doc"
RDEPENDS:${PN} += ""

inherit rpm
