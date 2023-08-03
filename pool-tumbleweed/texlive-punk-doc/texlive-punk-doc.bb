SUMMARY = "Documentation for texlive-punk"
DESCRIPTION = "This package includes the documentation for texlive-punk"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn27388"

RPM_NAME = "texlive-punk-doc-2023.209.svn27388-54.1.noarch.rpm"
RPM_HASH = "5e50e611b2d87fec6162422590cbb1905d7cb01c26512a54682c77dfa13b20e1c65cedc46af2e2e541e4cde69f4899fa69c3ce52645047b53c9dee1926c9c7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-doc"

RDEPENDS:${PN} += ""

inherit rpm
