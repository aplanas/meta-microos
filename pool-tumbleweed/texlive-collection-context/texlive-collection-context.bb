SUMMARY = "ConTeXt and packages"
DESCRIPTION = "Hans Hagen's powerful ConTeXt system, http://pragma-ade.com. \
Also includes third-party ConTeXt packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66171"

RPM_NAME = "texlive-collection-context-2023.208.svn66171-60.1.noarch.rpm"
RPM_HASH = "dc0d2bf7a51ca9190cd3c810efc6598540099a326ceacf356299469a6c46e695a0995174f781b1e0a9154606243a3b3db8170b8081c93f49f6fed79170654703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-context"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-context \
texlive-context-account \
texlive-context-algorithmic \
texlive-context-animation \
texlive-context-annotation \
texlive-context-bnf \
texlive-context-chromato \
texlive-context-cmscbf \
texlive-context-cmttbf \
texlive-context-construction-plan \
texlive-context-cyrillicnumbers \
texlive-context-degrade \
texlive-context-fancybreak \
texlive-context-filter \
texlive-context-french \
texlive-context-fullpage \
texlive-context-gantt \
texlive-context-gnuplot \
texlive-context-handlecsv \
texlive-context-layout \
texlive-context-letter \
texlive-context-lettrine \
texlive-context-mathsets \
texlive-context-rst \
texlive-context-ruby \
texlive-context-simplefonts \
texlive-context-simpleslides \
texlive-context-title \
texlive-context-transliterator \
texlive-context-typearea \
texlive-context-typescripts \
texlive-context-vim \
texlive-context-visualcounter \
texlive-jmn"

inherit rpm
