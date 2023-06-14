SUMMARY = "Documentation for texlive-bclogo"
DESCRIPTION = "This package includes the documentation for texlive-bclogo"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn39364"

RPM_NAME = "texlive-bclogo-doc-2023.201.3.1svn39364-53.1.noarch.rpm"
RPM_HASH = "4bd8d2637c669172ec264e83f390fa50b87b3fb662f6a8da6bb72ae16b927daeea0b915eb20b83ac11174c1f2da9f3260a9f079a3e0163f820202d3a18004360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bclogo-doc-fr;en \
texlive-bclogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
