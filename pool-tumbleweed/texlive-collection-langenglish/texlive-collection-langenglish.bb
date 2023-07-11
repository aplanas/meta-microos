SUMMARY = "US and UK English"
DESCRIPTION = "Support for, and documentation in, English."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65496"

RPM_NAME = "texlive-collection-langenglish-2023.208.svn65496-60.1.noarch.rpm"
RPM_HASH = "f351aca7f503ef39e3e88715fee6d340af1db2e7e2cf156061d91871751376a5dcb5fea0f9ea5e4883605e4a15d4bcb4f1f7ba02dc25244de1b20433ed0de895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langenglish"

RDEPENDS:${PN} += "texlive-amiweb2c-guide \
texlive-amscls-doc \
texlive-amslatex-primer \
texlive-around-the-bend \
texlive-ascii-chart \
texlive-biblatex-cheatsheet \
texlive-collection-basic \
texlive-components \
texlive-comprehensive \
texlive-dickimaw \
texlive-docsurvey \
texlive-dtxtut \
texlive-first-latex-doc \
texlive-fontinstallationguide \
texlive-forest-quickstart \
texlive-gentle \
texlive-guide-to-latex \
texlive-happy4th \
texlive-hyphen-english \
texlive-impatient \
texlive-intro-scientific \
texlive-knuth-errata \
texlive-knuth-hint \
texlive-knuth-pdf \
texlive-l2tabu-english \
texlive-latex-brochure \
texlive-latex-course \
texlive-latex-doc-ptr \
texlive-latex-for-undergraduates \
texlive-latex-graphics-companion \
texlive-latex-refsheet \
texlive-latex-veryshortguide \
texlive-latex-web-companion \
texlive-latex2e-help-texinfo \
texlive-latex4wp \
texlive-latexcheat \
texlive-latexcourse-rug \
texlive-latexfileinfo-pkgs \
texlive-lshort-english \
texlive-macros2e \
texlive-math-into-latex-4 \
texlive-maths-symbols \
texlive-memdesign \
texlive-memoirchapterstyles \
texlive-metafont-beginners \
texlive-metapost-examples \
texlive-patgen2-tutorial \
texlive-pictexsum \
texlive-plain-doc \
texlive-short-math-guide \
texlive-simplified-latex \
texlive-svg-inkscape \
texlive-tamethebeast \
texlive-tds \
texlive-tex-font-errors-cheatsheet \
texlive-tex-nutshell \
texlive-tex-overview \
texlive-tex-refs \
texlive-tex-vpat \
texlive-texbytopic \
texlive-texonly \
texlive-titlepages \
texlive-tlc2 \
texlive-tlc3-examples \
texlive-tlmgrbasics \
texlive-undergradmath \
texlive-visualfaq \
texlive-webguide \
texlive-xetexref \
texlive-yet-another-guide-latex2e"

inherit rpm
