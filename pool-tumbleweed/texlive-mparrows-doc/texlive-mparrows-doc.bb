SUMMARY = "Documentation for texlive-mparrows"
DESCRIPTION = "This package includes the documentation for texlive-mparrows"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.1svn39729"

RPM_NAME = "texlive-mparrows-doc-2023.209.0.0.1svn39729-55.1.noarch.rpm"
RPM_HASH = "6efd5248a6d37a3fbb7b3a17ca71898d718463f7309744dc3621ce96fc7fdc1e06fe5d3bc3be2016921057ddee839514af072a6d32da1bdba9a9a1b2b5a17233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
