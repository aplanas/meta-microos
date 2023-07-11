SUMMARY = "Czech/Slovak"
DESCRIPTION = "Support for Czech/Slovak."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langczechslovak-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "58f0171da358593db56cf6dc04b31fb8b1d4b79e8d132a86c046c11aeaa4ab6c4aeac4e331284c719299704173b7c33df325b0465cb53e362599f714ed8505c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langczechslovak"

RDEPENDS:${PN} += "texlive-babel-czech \
texlive-babel-slovak \
texlive-cnbwp \
texlive-collection-basic \
texlive-collection-latex \
texlive-cs \
texlive-csbulletin \
texlive-cslatex \
texlive-csplain \
texlive-cstex \
texlive-hyphen-czech \
texlive-hyphen-slovak \
texlive-lshort-czech \
texlive-lshort-slovak \
texlive-texlive-cz \
texlive-vlna"

inherit rpm
