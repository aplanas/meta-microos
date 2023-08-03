SUMMARY = "The wasy fonts (Waldi symbol fonts)"
DESCRIPTION = "This font contains all lasy characters (by L.Lamport, copyright \
notice in lasychr.mf), and a lot more symbols. Provided are the \
Metafont files for 5-10pt, and bold and slanted 10pt fonts, \
together with a .tex and .pdf documentation, and a file for \
using the fonts in a PLAIN-TeX document. Type-1 fonts by \
Michael Sharpe and Taco Hoekwater are available as separate \
package wasy-type1. Support under LaTeX is provided by Axel \
Kielhorn's wasysym package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.5svn53533"

RPM_NAME = "texlive-wasy-2023.209.2.5svn53533-54.1.noarch.rpm"
RPM_HASH = "b6ea55e25b16d4e576d81f3be59e65510634f304c0608a8f36e1ffbb863434a55851bf43481e1c3a22e6b45273e1f0315d6455d41a052f12ee647a5dc138216f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wasy10.tfm \
tex-wasy5.tfm \
tex-wasy6.tfm \
tex-wasy7.tfm \
tex-wasy8.tfm \
tex-wasy9.tfm \
tex-wasyb10.tfm \
tex-wasyfont.tex \
tex-wasysl10.tfm \
texlive-wasy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
