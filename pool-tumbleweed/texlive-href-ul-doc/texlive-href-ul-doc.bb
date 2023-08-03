SUMMARY = "Documentation for texlive-href-ul"
DESCRIPTION = "This package includes the documentation for texlive-href-ul"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-doc-2023.209.0.0.3.0svn64880-54.1.noarch.rpm"
RPM_HASH = "530c26329cb2f8e32888f015cdd4ec1026b8d80679ac0f438bb23ffbf30ca6fd145d6d8433bacbf9f887eb5551e622bef772c7aa1aaa8806746186c4a5e0c00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-href-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
