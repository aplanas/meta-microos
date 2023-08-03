SUMMARY = "A TeX system for publishing in Japanese"
DESCRIPTION = "pTeX adds features related to vertical writing, and deals with \
other problems in typesetting Japanese. A manual (in both \
Japanese and English) is distributed as package pTeX-manual."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-ptex-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "4a8e1a519ac3cbe7c072e4ce3c2aaa43e88368979bd5f48bccbf452e782b2e6635e8e5dcfe9e11db244e50a3b84c7e27e33a211c4710c73f111114886d1b52fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eptex.1 \
man-makejvf.1 \
man-mendex.1 \
man-pbibtex.1 \
man-ppltotf.1 \
man-ptex.1 \
man-ptftopl.1 \
texlive-ptex \
texlive-ptex-doc-/usr/share/man/man1/makejvf.1.gz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-updmap.cfg \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-ptex-base \
texlive-ptex-bin \
texlive-ptex-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
