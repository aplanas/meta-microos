SUMMARY = "Documentation for texlive-inconsolata"
DESCRIPTION = "This package includes the documentation for texlive-inconsolata"
LICENSE = "OFL-1.1"

PV = "2023.209.1.121svn54512"

RPM_NAME = "texlive-inconsolata-doc-2023.209.1.121svn54512-54.1.noarch.rpm"
RPM_HASH = "8ddefd99076aa4c9fe46675e1a8cc4827b848501027bb9d379a035b616320e719c77967148c863ed45758788d81e3e9ab0ddb1aa098701e6770d5a772c9c0b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inconsolata-doc"

RDEPENDS:${PN} += ""

inherit rpm
