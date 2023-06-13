SUMMARY = "Documentation for texlive-overarrows"
DESCRIPTION = "This package includes the documentation for texlive-overarrows"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65853"

RPM_NAME = "texlive-overarrows-doc-2023.201.1.1svn65853-54.1.noarch.rpm"
RPM_HASH = "8206d7c1d4294db2f8dbccc16a427d54d0bd36587c26bd4eb0572dab4046feb2540e28205d4b4225da93e43dca36f36f811e6e42a42d7346cdd853451d8719f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overarrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
