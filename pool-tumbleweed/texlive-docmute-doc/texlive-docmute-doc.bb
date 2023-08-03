SUMMARY = "Documentation for texlive-docmute"
DESCRIPTION = "This package includes the documentation for texlive-docmute"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn25741"

RPM_NAME = "texlive-docmute-doc-2023.209.1.4svn25741-53.1.noarch.rpm"
RPM_HASH = "f78df9d9052301c66060ae4f4f4f077fb9013002bb29f032be86b10141907e7d1de97a2e81b6f861ea14d83a98f13751008ff4d6620a824cf326ae15799fbc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docmute-doc"

RDEPENDS:${PN} += ""

inherit rpm
