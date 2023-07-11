SUMMARY = "Documentation for texlive-luatextra"
DESCRIPTION = "This package includes the documentation for texlive-luatextra"
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.1.0.1svn20747"

RPM_NAME = "texlive-luatextra-doc-2023.208.1.0.1svn20747-53.1.noarch.rpm"
RPM_HASH = "8f497d10092ef7afe6a0aa113fbae4240493e46b89ffbfc461895fae1dd310ad6e383b0f22853981b018fd0eaad398783c984e3ef9861a4ec27122f119696ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
