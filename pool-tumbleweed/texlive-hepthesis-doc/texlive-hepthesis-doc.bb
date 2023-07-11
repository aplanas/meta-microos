SUMMARY = "Documentation for texlive-hepthesis"
DESCRIPTION = "This package includes the documentation for texlive-hepthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn46054"

RPM_NAME = "texlive-hepthesis-doc-2023.201.1.5.2svn46054-53.2.noarch.rpm"
RPM_HASH = "972c3589f77c32d3b6e5290141fa9b998518f945408518bd491ccddcb2371488199c499aeb3fe98a5e288c5e56053b1327b098cd2a0d78330004e396dc283e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepthesis-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
