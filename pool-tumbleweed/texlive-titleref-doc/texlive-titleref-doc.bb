SUMMARY = "Documentation for texlive-titleref"
DESCRIPTION = "This package includes the documentation for texlive-titleref"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.1svn18729"

RPM_NAME = "texlive-titleref-doc-2023.209.3.1svn18729-53.1.noarch.rpm"
RPM_HASH = "e0857fe5b513668137d4c14a8281fec02202f1cbd6dc584e95bc95248e3b9729511a5885dc4c1850c8bee5f0e1d7dd74731aa0d20c2d49c4f6768ad17d969201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titleref-doc"

RDEPENDS:${PN} += ""

inherit rpm
