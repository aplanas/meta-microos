SUMMARY = "Documentation for texlive-custom-bib"
DESCRIPTION = "This package includes the documentation for texlive-custom-bib"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.33svn24729"

RPM_NAME = "texlive-custom-bib-doc-2023.209.4.33svn24729-55.1.noarch.rpm"
RPM_HASH = "c7d6a812492a307732bd806c1d3c61dabe28c7b04f553c8ea52b92344a919efe49d5412cd44dd26ca2b75845d356fcf785720874fbf0a7aead0f92dc1498bf5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-custom-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
