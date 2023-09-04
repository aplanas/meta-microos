SUMMARY = "Documentation for texlive-hvextern"
DESCRIPTION = "This package includes the documentation for texlive-hvextern"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.33svn65670"

RPM_NAME = "texlive-hvextern-doc-2023.209.0.0.33svn65670-54.1.noarch.rpm"
RPM_HASH = "f789d0ec5cb827042e30deb747f7250fdbf564be6de1351fd2c6646750f31a55a89403f0bc3e9f835ff3895ec1c8fb684a1e9dbdcd268d21c393e29928558308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvextern-doc"

RDEPENDS:${PN} += ""

inherit rpm
