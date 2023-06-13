SUMMARY = "Documentation for texlive-serbian-apostrophe"
DESCRIPTION = "This package includes the documentation for texlive-serbian-apostrophe"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23799"

RPM_NAME = "texlive-serbian-apostrophe-doc-2023.201.svn23799-53.1.noarch.rpm"
RPM_HASH = "40d8084e4a7bd1b7715de1d8023e09d58f275356834765af78298ed8133f921863643b1b73b6a5d625cd3c676d20a022101e47e836b63b79b4b2ae5ed10674dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-apostrophe-doc"

RDEPENDS:${PN} += ""

inherit rpm
