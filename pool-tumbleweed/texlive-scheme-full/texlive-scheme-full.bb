SUMMARY = "Full scheme (everything)"
DESCRIPTION = "This is the full TeX Live scheme: it installs everything \
available."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-scheme-full-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "53b0329574fb39c924da8d74295756496a318bc35e942cea34f59a14199ac07abc182444b5eccac40151730dacd8828c82cec988915c7a3bcd1dd19c8d3a0415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-full"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-bibtexextra \
texlive-collection-binextra \
texlive-collection-context \
texlive-collection-fontsextra \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-formatsextra \
texlive-collection-games \
texlive-collection-humanities \
texlive-collection-langarabic \
texlive-collection-langchinese \
texlive-collection-langcjk \
texlive-collection-langcyrillic \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langgreek \
texlive-collection-langitalian \
texlive-collection-langjapanese \
texlive-collection-langkorean \
texlive-collection-langother \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexextra \
texlive-collection-latexrecommended \
texlive-collection-luatex \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-music \
texlive-collection-pictures \
texlive-collection-plaingeneric \
texlive-collection-pstricks \
texlive-collection-publishers \
texlive-collection-xetex"

inherit rpm
