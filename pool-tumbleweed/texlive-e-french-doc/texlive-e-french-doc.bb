SUMMARY = "Documentation for texlive-e-french"
DESCRIPTION = "This package includes the documentation for texlive-e-french"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.11svn52027"

RPM_NAME = "texlive-e-french-doc-2023.201.6.11svn52027-53.2.noarch.rpm"
RPM_HASH = "0281d628b037a70c36d6e5926ba1d4967e9e89415717b4180da6fb11dc8378e422e85d636f1bce37c748d1c0f9662c97c449d713dd37416cfd821797c241a309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-e-french-doc-en;fr \
texlive-e-french-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
