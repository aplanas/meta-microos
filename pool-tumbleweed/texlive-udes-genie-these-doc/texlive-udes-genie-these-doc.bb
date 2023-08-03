SUMMARY = "Documentation for texlive-udes-genie-these"
DESCRIPTION = "This package includes the documentation for texlive-udes-genie-these"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn65039"

RPM_NAME = "texlive-udes-genie-these-doc-2023.209.3.0.1svn65039-54.1.noarch.rpm"
RPM_HASH = "2870199f9bea938a70f9014eb9fe3b54e101d0b0463d55b0fd0c3d7465395e251f578a5b55389592fa2053e64a8172ca2bf8e631e33cd4083e88c9017ebf0dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-udes-genie-these-doc-fr-ca \
texlive-udes-genie-these-doc"

RDEPENDS:${PN} += ""

inherit rpm
