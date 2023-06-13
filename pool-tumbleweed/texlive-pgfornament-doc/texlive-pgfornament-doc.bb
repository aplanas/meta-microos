SUMMARY = "Documentation for texlive-pgfornament"
DESCRIPTION = "This package includes the documentation for texlive-pgfornament"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn55326"

RPM_NAME = "texlive-pgfornament-doc-2023.201.1.2svn55326-51.1.noarch.rpm"
RPM_HASH = "feed64f28eabb198842d62f6fa437bfbe8c930dcec80e58515baf62554869f8f65748a7c30b0164dc857994516ce1010f5e3b10766d60e43d06d095862fdd0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfornament-doc"

RDEPENDS:${PN} += ""

inherit rpm
