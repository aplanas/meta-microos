SUMMARY = "Documentation for texlive-mnsymbol"
DESCRIPTION = "This package includes the documentation for texlive-mnsymbol"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.4svn18651"

RPM_NAME = "texlive-mnsymbol-doc-2023.209.1.4svn18651-55.1.noarch.rpm"
RPM_HASH = "85dd84dad66e906d5376a5afe77dc4ee651b4074dd201ce486257e4c6665641edb480e4837fb2a0c6d38104e9d837f549bf97b2a57dd60cf9b0b4573290c3428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
