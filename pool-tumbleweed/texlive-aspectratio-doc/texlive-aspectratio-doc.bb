SUMMARY = "Documentation for texlive-aspectratio"
DESCRIPTION = "This package includes the documentation for texlive-aspectratio"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn25243"

RPM_NAME = "texlive-aspectratio-doc-2023.201.2.0svn25243-53.1.noarch.rpm"
RPM_HASH = "6941217fb9bc85acd5f3d359931d07348c5c06310dbd4698f26e260750c2b53096d3952eca89153d0a6a3c7ac707a8b5115294fc94a7ff3fca774d34d13dd1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aspectratio-doc"

RDEPENDS:${PN} += ""

inherit rpm
