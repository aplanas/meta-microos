SUMMARY = "Documentation for texlive-exam-randomizechoices"
DESCRIPTION = "This package includes the documentation for texlive-exam-randomizechoices"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn61719"

RPM_NAME = "texlive-exam-randomizechoices-doc-2023.209.0.0.2svn61719-53.1.noarch.rpm"
RPM_HASH = "896444b8e00b761176671eee7ad6a8303da15b63e4654a248ceaca5321548f51f7de29c3df2fe56a8caad86c7a05fecd24cffc1940e4f06a5f6b7ad3e0d9cc88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-randomizechoices-doc"

RDEPENDS:${PN} += ""

inherit rpm
