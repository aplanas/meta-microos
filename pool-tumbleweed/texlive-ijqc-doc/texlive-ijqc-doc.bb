SUMMARY = "Documentation for texlive-ijqc"
DESCRIPTION = "This package includes the documentation for texlive-ijqc"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn15878"

RPM_NAME = "texlive-ijqc-doc-2023.208.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "cf020c0159aa3fafc435a85dee2218c7745cb3df396e2cd53b0739da787db565ee4e1df527546aa65cf37888404bfb39d67aa1d4767f9811389b0e3941a6275c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc-doc"

RDEPENDS:${PN} += ""

inherit rpm
