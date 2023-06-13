SUMMARY = "Documentation for texlive-upquote"
DESCRIPTION = "This package includes the documentation for texlive-upquote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn26059"

RPM_NAME = "texlive-upquote-doc-2023.201.1.3svn26059-53.1.noarch.rpm"
RPM_HASH = "221b0b112b9cfa8a35d79cf188c89b774bfd3df5ae11d3dd618c7e1eb676dd1560f339bd42ff9984dbbe2da2b6164a478fd3581de0384ffd7f98812e25cf4807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upquote-doc"

RDEPENDS:${PN} += ""

inherit rpm
