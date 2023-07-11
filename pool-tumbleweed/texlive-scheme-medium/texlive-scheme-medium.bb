SUMMARY = "Medium scheme (small + more packages and languages)"
DESCRIPTION = "This is the medium TeX Live collection: it contains plain TeX, \
LaTeX, many recommended packages, and support for most European \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-scheme-medium-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "ac1408a105f4b701aed30ddd94c147c6805771fdfa0ad4a087aa981a2a4cf8e15198bbe3b6f966878f689db3d010bfbf356239902a355b9ef3810b2f48f06530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-medium"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-binextra \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langitalian \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-luatex \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-plaingeneric \
texlive-collection-xetex"

inherit rpm
