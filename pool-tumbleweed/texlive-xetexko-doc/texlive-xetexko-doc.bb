SUMMARY = "Documentation for texlive-xetexko"
DESCRIPTION = "This package includes the documentation for texlive-xetexko"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn64894"

RPM_NAME = "texlive-xetexko-doc-2023.209.4.2svn64894-53.1.noarch.rpm"
RPM_HASH = "8a4b80837ebd6fc2329ae1f91b210d1433b5fc9896c175986d4568ca39fb599da2f4de786db6bd4a9c2778e638b0e288993249e22cd58f696339e8b10534a34b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xetexko-doc-ko \
texlive-xetexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
