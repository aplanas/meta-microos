SUMMARY = "Documentation for texlive-har2nat"
DESCRIPTION = "This package includes the documentation for texlive-har2nat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-har2nat-doc-2023.201.1.0svn54080-53.2.noarch.rpm"
RPM_HASH = "144fc3f5294c5a84f7d0faf48a4263f18e29be8282001e53eaad60e024a0d1627f1b1ed9bbcce6bca5c9da350f3d3d83f22ef4b30ab9acc932c2b1789e506306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-har2nat-doc"

RDEPENDS:${PN} += ""

inherit rpm
