SUMMARY = "Documentation for texlive-pst-thick"
DESCRIPTION = "This package includes the documentation for texlive-pst-thick"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16369"

RPM_NAME = "texlive-pst-thick-doc-2023.209.1.0svn16369-54.2.noarch.rpm"
RPM_HASH = "a1dfdd247e2d1bab8138bfc289aac8dc6d666007bce90322db5b90283171bb199f41b846b407db50c48a59686e3e31a51d24dac57b89e4f1532bb3b88d343c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-thick-doc-fr \
texlive-pst-thick-doc"

RDEPENDS:${PN} += ""

inherit rpm
