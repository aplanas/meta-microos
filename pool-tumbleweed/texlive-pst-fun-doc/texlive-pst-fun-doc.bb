SUMMARY = "Documentation for texlive-pst-fun"
DESCRIPTION = "This package includes the documentation for texlive-pst-fun"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn17909"

RPM_NAME = "texlive-pst-fun-doc-2023.201.0.0.04svn17909-52.1.noarch.rpm"
RPM_HASH = "d722940bc14d8e25f062d1c89b8a90724f28c9a5e41b29d04d62b2baeeddb9c184a230c9842b1f2e2ba143d7019ce1f260f5e142dcc8916129863d9b6a4f523e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fun-doc"

RDEPENDS:${PN} += ""

inherit rpm
