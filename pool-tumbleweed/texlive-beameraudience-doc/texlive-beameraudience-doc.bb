SUMMARY = "Documentation for texlive-beameraudience"
DESCRIPTION = "This package includes the documentation for texlive-beameraudience"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn23427"

RPM_NAME = "texlive-beameraudience-doc-2023.209.0.0.1svn23427-54.1.noarch.rpm"
RPM_HASH = "16493db5fcbbfc86a9c7d0d6656b0644fff3e438adf8b2112cfb8b14dbc0421a5abbeeeb35262a557050acf1f874ae62fc7379a20ffb79b84dbedb493f5519cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beameraudience-doc"

RDEPENDS:${PN} += ""

inherit rpm
