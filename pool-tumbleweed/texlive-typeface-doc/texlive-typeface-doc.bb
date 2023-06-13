SUMMARY = "Documentation for texlive-typeface"
DESCRIPTION = "This package includes the documentation for texlive-typeface"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27046"

RPM_NAME = "texlive-typeface-doc-2023.201.0.0.1svn27046-52.1.noarch.rpm"
RPM_HASH = "41537b83000e8e20e62e1fb24590bf4a234e1b0a66de4343cc7d89bcfc16c9eba1ea5fdcbc630a752c9266988b1b1e68efc81d07603c1b6760bc45891cb0b00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeface-doc"

RDEPENDS:${PN} += ""

inherit rpm
