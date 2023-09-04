SUMMARY = "Documentation for texlive-hep-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-hep-bibliography"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-doc-2023.209.1.1svn64888-54.2.noarch.rpm"
RPM_HASH = "3ceea4bc45f5c7ed355a76f632f86301906fa7a3bd15d8713a6421832ceefca499298df894089817e10b24a0683ede6a93377bd872009b1cff024cfeaf7a329a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
