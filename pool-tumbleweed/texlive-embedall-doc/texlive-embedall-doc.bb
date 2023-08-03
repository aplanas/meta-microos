SUMMARY = "Documentation for texlive-embedall"
DESCRIPTION = "This package includes the documentation for texlive-embedall"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn51177"

RPM_NAME = "texlive-embedall-doc-2023.209.2.0svn51177-54.1.noarch.rpm"
RPM_HASH = "0f47c185ff1997b549e6ce114661e8ebba1a68c4c5076819250d38a6926971e97389d16d5fb90e30559662ab9aecf83f3ba110ac8cedd00d0b266d28c45c2161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedall-doc"

RDEPENDS:${PN} += ""

inherit rpm
