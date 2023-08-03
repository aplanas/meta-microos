SUMMARY = "A TeX extension writing HINT output for on-screen reading"
DESCRIPTION = "An extension of TeX which generates HINT output. The HINT file \
format is an alternative to the DVI and PDF formats which was \
designed specifically for on-screen reading of documents. \
Especially on mobile devices, reading DVI or PDF documents can \
be cumbersome. Mobile devices are available in a large variety \
of sizes but typically are not large enough to display \
documents formated for a4/letter-size paper. To compensate for \
the limitations of a small screen, users are used to \
alternating between landscape (few long lines) and portrait \
(more short lines) mode. The HINT format supports variable and \
varying screen sizes, leveraging the ability of TeX to format a \
document for nearly-arbitrary values of \\hsize and \\vsize."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65883"

RPM_NAME = "texlive-hitex-2023.209.svn65883-54.1.noarch.rpm"
RPM_HASH = "24eee809b2488af9d31138c91cf829ee39c33ec8427903a2ff351204bd780266221b1060ad19174580b69b7aaff1e3f97ba9229b57b9906ac4e594d29be8dcc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hiltxpage.tex \
tex-hiplainpage.tex \
tex-ifhint.tex \
texlive-hitex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-etex \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hitex-bin \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
