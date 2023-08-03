SUMMARY = "Documentation for texlive-grid-system"
DESCRIPTION = "This package includes the documentation for texlive-grid-system"
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-doc-2023.209.0.0.3.0svn32981-54.1.noarch.rpm"
RPM_HASH = "dc2cae03779e72fd524aec1b55c2609680f0c8a82929baf7d30947ec4f76231d05b789082acb7ca4205507ddd5a8a4628f988d879497dab1ea524c1896d8936a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-system-doc"

RDEPENDS:${PN} += ""

inherit rpm
