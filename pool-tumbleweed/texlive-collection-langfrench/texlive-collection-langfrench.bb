SUMMARY = "French"
DESCRIPTION = "Support for French and Basque."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63147"

RPM_NAME = "texlive-collection-langfrench-2023.208.svn63147-60.1.noarch.rpm"
RPM_HASH = "2090cb0c2e5baf61c2775da2317d06240299ce1c6913b2ed690dd2dcce95b25a09c3167808a73c0291b4be093f8c081f9a0a000d4e21494f24ba78d395990845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langfrench"

RDEPENDS:${PN} += "texlive-aeguill \
texlive-annee-scolaire \
texlive-apprendre-a-programmer-en-tex \
texlive-apprends-latex \
texlive-babel-basque \
texlive-babel-french \
texlive-basque-book \
texlive-basque-date \
texlive-bib-fr \
texlive-bibleref-french \
texlive-booktabs-fr \
texlive-collection-basic \
texlive-droit-fr \
texlive-e-french \
texlive-epslatex-fr \
texlive-expose-expl3-dunkerque-2019 \
texlive-facture \
texlive-formation-latex-ul \
texlive-frenchmath \
texlive-frletter \
texlive-frpseudocode \
texlive-hyphen-basque \
texlive-hyphen-french \
texlive-impatient-fr \
texlive-impnattypo \
texlive-l2tabu-french \
texlive-latex2e-help-texinfo-fr \
texlive-letgut \
texlive-lshort-french \
texlive-mafr \
texlive-matapli \
texlive-profcollege \
texlive-proflabo \
texlive-proflycee \
texlive-tabvar \
texlive-tdsfrmath \
texlive-texlive-fr \
texlive-translation-array-fr \
texlive-translation-dcolumn-fr \
texlive-translation-natbib-fr \
texlive-translation-tabbing-fr \
texlive-variations \
texlive-visualfaq-fr \
texlive-visualtikz"

inherit rpm
