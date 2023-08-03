SUMMARY = "Documentation for texlive-vntex"
DESCRIPTION = "This package includes the documentation for texlive-vntex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.2svn62837"

RPM_NAME = "texlive-vntex-doc-2023.209.3.2.2svn62837-54.1.noarch.rpm"
RPM_HASH = "58708d557d5c0055f8535437dd9f3b0b582a23f5f748373751a1ba37a7050d2ebd648cd1e1a4bcb0b1967ca21d58ab53e5918694cd187d094842126fcc3dd690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-vntex-doc-en;vi \
texlive-vntex-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
