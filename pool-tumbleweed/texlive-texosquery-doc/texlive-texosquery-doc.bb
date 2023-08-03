SUMMARY = "Documentation for texlive-texosquery"
DESCRIPTION = "This package includes the documentation for texlive-texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn53676"

RPM_NAME = "texlive-texosquery-doc-2023.209.1.7svn53676-55.1.noarch.rpm"
RPM_HASH = "827ab4b83f2b8e8ffbbf613fd7e0c6e0d4b6b2a3f1240a2332b68bd12776f94b5f1cdd19d3e04cc1b2b1193302a3ac754a31067a18d83e8f199958b5ef0a5895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texosquery-doc"

RDEPENDS:${PN} += ""

inherit rpm
