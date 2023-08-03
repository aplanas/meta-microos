SUMMARY = "A set TeX/LaTeX packages for drawing Petri nets"
DESCRIPTION = "Petri-nets offers a set of TeX/LaTeX packages about Petri nets \
and related models. Three packages are available: the first \
allows the user to draw Petri-nets in PostScript documents; the \
second defines macros related to PBC, M-nets and B(PN) models; \
and a third that combines the other two."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn39165"

RPM_NAME = "texlive-petri-nets-2023.209.svn39165-52.1.noarch.rpm"
RPM_HASH = "95c16454be19e6396bd9fbe080beaaeaea5cef3b7dbd51f8f266e0fc302e7ad3f397f561b3941a780e5f21c1fc57db5847f3d5febe1717443800ba06ca65835f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pndraw.sty \
tex-pndraw.tex \
tex-pnets.sty \
tex-pnets.tex \
tex-pntext.sty \
tex-pntext.tex \
tex-pnversion.tex \
texlive-petri-nets"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Digest--MD5 \
perl-Getopt--Long \
perl-strict \
sed \
tex-amsfonts.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-petri-nets-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
