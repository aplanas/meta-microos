SUMMARY = "GUST TeX Live scheme"
DESCRIPTION = "This is the GUST TeX Live scheme: it is a set of files \
sufficient to typeset Polish plain TeX, LaTeX and ConTeXt \
documents in PostScript or PDF."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59755"

RPM_NAME = "texlive-scheme-gust-2023.208.svn59755-60.1.noarch.rpm"
RPM_HASH = "eb0355aa65176cb7937e7c58db19ca385788f198d4d702037ebc12d48fc79854cef4dbab7475b7a7583b94b34d963ab56c05fcc4e8b70c4f3a85856f8549b239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-gust"

RDEPENDS:${PN} += "texlive-amslatex-primer \
texlive-amstex \
texlive-antt \
texlive-bibtex8 \
texlive-collection-basic \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-langpolish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-metapost \
texlive-collection-plaingeneric \
texlive-collection-xetex \
texlive-comment \
texlive-comprehensive \
texlive-concrete \
texlive-cyklop \
texlive-dvidvi \
texlive-dviljk \
texlive-fontinstallationguide \
texlive-gustprog \
texlive-impatient \
texlive-iwona \
texlive-metafont-beginners \
texlive-metapost-examples \
texlive-poltawski \
texlive-seetexk \
texlive-seminar \
texlive-tds \
texlive-tex4ht \
texlive-texdoc"

inherit rpm
