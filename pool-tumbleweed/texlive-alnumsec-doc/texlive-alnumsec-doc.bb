SUMMARY = "Documentation for texlive-alnumsec"
DESCRIPTION = "This package includes the documentation for texlive-alnumsec"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn15878"

RPM_NAME = "texlive-alnumsec-doc-2023.209.0.0.03svn15878-55.1.noarch.rpm"
RPM_HASH = "be11dd543d61a444e0d64da62fb66d7da20a9f17f902bea46c4b57eb62a5fbd193d47a249cf6e9f7fc37a03840c68d7f2988ff5510f2bb198d1d32124e30e7c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alnumsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
