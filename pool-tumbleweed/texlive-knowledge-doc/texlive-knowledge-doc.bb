SUMMARY = "Documentation for texlive-knowledge"
DESCRIPTION = "This package includes the documentation for texlive-knowledge"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.28svn61991"

RPM_NAME = "texlive-knowledge-doc-2023.209.1.28svn61991-56.1.noarch.rpm"
RPM_HASH = "c18c79f27a6ad53ac589d34fe1b9446d401e712a5965c8323277beb528ca54077a286da30d01ad49cd245e37734806e38b9c11522ddba5504390618d4d0ae38a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knowledge-doc"

RDEPENDS:${PN} += ""

inherit rpm
