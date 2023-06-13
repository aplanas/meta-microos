SUMMARY = "Documentation for texlive-noconflict"
DESCRIPTION = "This package includes the documentation for texlive-noconflict"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30140"

RPM_NAME = "texlive-noconflict-doc-2023.201.1.0svn30140-54.1.noarch.rpm"
RPM_HASH = "6daf4b2cdbaaeae30932a34c44376029aac54d1f9bfa953af78c5ef6d61dc2018650bcec7772bced9067132737d23773e47214e17797f09c8d6c89cd14af6557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noconflict-doc"

RDEPENDS:${PN} += ""

inherit rpm
