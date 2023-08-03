SUMMARY = "Documentation for texlive-babel-serbian"
DESCRIPTION = "This package includes the documentation for texlive-babel-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2asvn64571"

RPM_NAME = "texlive-babel-serbian-doc-2023.209.2.2asvn64571-54.1.noarch.rpm"
RPM_HASH = "debe0daca01ea21213e0b2d7ef8ccde9fe031ac3bc3f722adeef6894ea26bfec1c89cf70ee57e41e56d1b3d84945465aa3d3da39d5bc8a1834dcc0f3582359d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
