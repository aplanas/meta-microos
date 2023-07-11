SUMMARY = "LaTeX fundamental packages"
DESCRIPTION = "These packages are either mandated by the core LaTeX team, or \
very widely used and strongly recommended in practice."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63515"

RPM_NAME = "texlive-collection-latex-2023.208.svn63515-60.1.noarch.rpm"
RPM_HASH = "d31f9f4b2240b4bdd76be2596ee47d2732f48467b0725f6065e795e20522013289dddda716141e630159afb23e9b4ff08125f0482dd4f8ff1d2f81673d1ab16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex \
texlive-collection-latex"

RDEPENDS:${PN} += "texlive-ae \
texlive-amscls \
texlive-amsmath \
texlive-atbegshi \
texlive-atveryend \
texlive-auxhook \
texlive-babel \
texlive-babel-english \
texlive-babelbib \
texlive-bigintcalc \
texlive-bitset \
texlive-bookmark \
texlive-carlisle \
texlive-collection-basic \
texlive-colortbl \
texlive-epstopdf-pkg \
texlive-etexcmds \
texlive-fancyhdr \
texlive-firstaid \
texlive-fix2col \
texlive-geometry \
texlive-gettitlestring \
texlive-graphics \
texlive-graphics-cfg \
texlive-grfext \
texlive-hopatch \
texlive-hycolor \
texlive-hyperref \
texlive-intcalc \
texlive-kvdefinekeys \
texlive-kvoptions \
texlive-kvsetkeys \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-bin \
texlive-latex-fonts \
texlive-latex-lab \
texlive-latexconfig \
texlive-letltxmacro \
texlive-ltxcmds \
texlive-ltxmisc \
texlive-mfnfss \
texlive-mptopdf \
texlive-natbib \
texlive-oberdiek \
texlive-pagesel \
texlive-pdfescape \
texlive-pslatex \
texlive-psnfss \
texlive-pspicture \
texlive-refcount \
texlive-rerunfilecheck \
texlive-stringenc \
texlive-tools \
texlive-uniquecounter \
texlive-url"

inherit rpm
