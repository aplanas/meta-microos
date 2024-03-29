SUMMARY = "PLaTeX2e and miscellaneous macros for upTeX"
DESCRIPTION = "The bundle provides pLaTeX2e macros for upTeX by Takuji Tanaka. \
This is a community edition syncing with platex. The bundle \
depends on platex."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-uplatex-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "f75b26a558a2146396f392897ee030e6a3ea74982336b914e6b35e823289e990bdfb7f4c68ba2da8d9a855057839c8cc6dbd03c931274edc3f336b0e5918f65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jt2gt.fd \
tex-jt2mc.fd \
tex-jy2gt.fd \
tex-jy2mc.fd \
tex-ujarticle.cls \
tex-ujbk10.clo \
tex-ujbk11.clo \
tex-ujbk12.clo \
tex-ujbook.cls \
tex-ujreport.cls \
tex-ujsize10.clo \
tex-ujsize11.clo \
tex-ujsize12.clo \
tex-ukinsoku.tex \
tex-uptrace.sty \
tex-utarticle.cls \
tex-utbk10.clo \
tex-utbk11.clo \
tex-utbk12.clo \
tex-utbook.cls \
tex-utreport.cls \
tex-utsize10.clo \
tex-utsize11.clo \
tex-utsize12.clo \
texlive-uplatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-plext.sty \
tex-ptrace.sty \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-base-dev \
texlive-latex-firstaid-dev \
texlive-latex-fonts \
texlive-platex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-uplatex-bin \
texlive-uptex \
texlive-uptex-fonts"

inherit rpm
