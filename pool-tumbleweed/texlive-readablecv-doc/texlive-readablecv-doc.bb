SUMMARY = "Documentation for texlive-readablecv"
DESCRIPTION = "This package includes the documentation for texlive-readablecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn61719"

RPM_NAME = "texlive-readablecv-doc-2023.201.3.0svn61719-53.2.noarch.rpm"
RPM_HASH = "869602d1a5abbf02d155ddde751fae14f8a66ee68ca14a31fc57c2606de0c4b7b30063b152eb550fc1a8445db467de4ab2b1110a16ff682b025b472f16064dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readablecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
