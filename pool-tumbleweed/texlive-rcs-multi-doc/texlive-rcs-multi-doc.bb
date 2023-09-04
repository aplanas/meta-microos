SUMMARY = "Documentation for texlive-rcs-multi"
DESCRIPTION = "This package includes the documentation for texlive-rcs-multi"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-doc-2023.209.0.0.1asvn64967-54.2.noarch.rpm"
RPM_HASH = "1ac93d010286b4f1480c2c12480261d030ff41127e391e638d4243e27f99c09883fed714ca63dfcbd748d5147074824f6fa6906ef415bdf9f26fb5e62fd14e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
