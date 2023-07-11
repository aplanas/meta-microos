SUMMARY = "German"
DESCRIPTION = "Support for German."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn55706"

RPM_NAME = "texlive-collection-langgerman-2023.208.svn55706-60.1.noarch.rpm"
RPM_HASH = "b2f58f0eee024607ac879bab858fcd12bab58741f4b2be2954d7bab8a9abfe049507c9ff17e6c07751030a389462f0c04159735199f47a599f7f3921119f40ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langgerman"

RDEPENDS:${PN} += "texlive-apalike-german \
texlive-babel-german \
texlive-bibleref-german \
texlive-booktabs-de \
texlive-collection-basic \
texlive-csquotes-de \
texlive-dehyph \
texlive-dehyph-exptl \
texlive-dhua \
texlive-dtk-bibliography \
texlive-etdipa \
texlive-etoolbox-de \
texlive-fifinddo-info \
texlive-german \
texlive-germbib \
texlive-germkorr \
texlive-hausarbeit-jura \
texlive-hyphen-german \
texlive-koma-script-examples \
texlive-l2picfaq \
texlive-l2tabu \
texlive-latexcheat-de \
texlive-lshort-german \
texlive-lualatex-doc-de \
texlive-microtype-de \
texlive-milog \
texlive-quran-de \
texlive-r-und-s \
texlive-schulmathematik \
texlive-templates-fenn \
texlive-templates-sommer \
texlive-termcal-de \
texlive-texlive-de \
texlive-tipa-de \
texlive-translation-arsclassica-de \
texlive-translation-biblatex-de \
texlive-translation-chemsym-de \
texlive-translation-ecv-de \
texlive-translation-enumitem-de \
texlive-translation-europecv-de \
texlive-translation-filecontents-de \
texlive-translation-moreverb-de \
texlive-udesoftec \
texlive-uhrzeit \
texlive-umlaute \
texlive-voss-mathcol"

inherit rpm
