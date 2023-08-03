SUMMARY = "Documentation for texlive-cyrillic-bin"
DESCRIPTION = "This package includes the documentation for texlive-cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62517"

RPM_NAME = "texlive-cyrillic-bin-doc-2023.209.svn62517-55.1.noarch.rpm"
RPM_HASH = "0650080d2cbdd60d353268d9961b7c2927e58c455b240157099d4356a3e7e42c12f650863a0666d0ea82e23808ebd10b8778417dcfab236c4af4fac58e6e59af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-rubibtex.1 \
man-rumakeindex.1 \
texlive-cyrillic-bin-doc"

RDEPENDS:${PN} += ""

inherit rpm
