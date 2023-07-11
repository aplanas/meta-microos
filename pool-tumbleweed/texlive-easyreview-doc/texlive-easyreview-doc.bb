SUMMARY = "Documentation for texlive-easyreview"
DESCRIPTION = "This package includes the documentation for texlive-easyreview"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn38352"

RPM_NAME = "texlive-easyreview-doc-2023.201.1.0svn38352-53.2.noarch.rpm"
RPM_HASH = "2d4874f81cadef81b0af85b2457d23b51c64d4923292f6a5844ec59fb5a5ac87beeab60a2db7fc6e60015c10abfa822ee0fd3f42f6b08bd5669ee0deb2467273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyreview-doc"

RDEPENDS:${PN} += ""

inherit rpm
