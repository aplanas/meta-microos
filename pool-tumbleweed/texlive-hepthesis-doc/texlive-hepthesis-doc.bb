SUMMARY = "Documentation for texlive-hepthesis"
DESCRIPTION = "This package includes the documentation for texlive-hepthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2svn46054"

RPM_NAME = "texlive-hepthesis-doc-2023.209.1.5.2svn46054-54.1.noarch.rpm"
RPM_HASH = "4cc74d59800aaf12435e8d462adaf0b41b996a7469012de201d20f54193fea4773f6e0f07ec7179721450df3d229498df9bc4b0848db4a84787869274f149999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepthesis-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
