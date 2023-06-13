SUMMARY = "Documentation for texlive-dichokey"
DESCRIPTION = "This package includes the documentation for texlive-dichokey"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17192"

RPM_NAME = "texlive-dichokey-doc-2023.201.svn17192-52.1.noarch.rpm"
RPM_HASH = "5e6b709dd548437e3c890e1cfd6114c3f876b0ca39c9cb439c460d415124c4bc3bfce51b8259de139191b9aabaffc389c97978e2bb8bd689c2df288d6136975b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
