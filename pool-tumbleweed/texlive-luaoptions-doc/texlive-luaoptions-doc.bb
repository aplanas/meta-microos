SUMMARY = "Documentation for texlive-luaoptions"
DESCRIPTION = "This package includes the documentation for texlive-luaoptions"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn64870"

RPM_NAME = "texlive-luaoptions-doc-2023.201.0.0.8svn64870-52.1.noarch.rpm"
RPM_HASH = "d12955fbea5cd3783144480aef7d0c7c321430512df481d6fe9214d3788014639497a5416b3b876ae83c2178a94e0707c3b2d7162e7d9805903d808746f249f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaoptions-doc"
RDEPENDS:${PN} += ""

inherit rpm
