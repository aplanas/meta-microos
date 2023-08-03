SUMMARY = "Documentation for texlive-a5comb"
DESCRIPTION = "This package includes the documentation for texlive-a5comb"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4svn17020"

RPM_NAME = "texlive-a5comb-doc-2023.209.4svn17020-55.1.noarch.rpm"
RPM_HASH = "69baaf40c4c5562de312e58b93b7f7b080b5155c307a64f2fd28af117660ef018084ff9d79e4983ebebd17546ea7174b6892aedf8f7e8bb377e440772a6e4bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-a5comb-doc"

RDEPENDS:${PN} += ""

inherit rpm
