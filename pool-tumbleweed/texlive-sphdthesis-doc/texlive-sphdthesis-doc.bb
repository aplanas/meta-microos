SUMMARY = "Documentation for texlive-sphdthesis"
DESCRIPTION = "This package includes the documentation for texlive-sphdthesis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn34374"

RPM_NAME = "texlive-sphdthesis-doc-2023.209.1.0svn34374-58.1.noarch.rpm"
RPM_HASH = "e849be6237269ace7a527ccda83aa975513fb45d75d1faf3639330590a3397ce48d77a780283844133f0f28cdc0f49cc9defe174a01bc8be351b2047f6f2b8ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sphdthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
