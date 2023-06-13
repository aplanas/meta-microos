SUMMARY = "Documentation for texlive-sugconf"
DESCRIPTION = "This package includes the documentation for texlive-sugconf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58752"

RPM_NAME = "texlive-sugconf-doc-2023.201.svn58752-57.1.noarch.rpm"
RPM_HASH = "a49f903f36f9d14e0b4a380b861c464a3a2dca942bfd87c336060a4512df7373b92b1f0150aea7fad27e1d14a7ac88ec645cbce64c3b29f7279ac1227b4b08d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sugconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
