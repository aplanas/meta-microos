SUMMARY = "A TeX system for publishing in Japanese"
DESCRIPTION = "pTeX adds features related to vertical writing, and deals with \
other problems in typesetting Japanese. A manual (in both \
Japanese and English) is distributed as package pTeX-manual."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-ptex-2023.209.svn66186-54.2.noarch.rpm"
RPM_HASH = "2e2e2b3a2a4b30354d8fe2cb1fedc314800d5b07e47fef45ef377e91eb10a33f87c6fefb6461c8cf597cb9c3aa96fa4c74fe7424d223e5f4ba8ea343482a6b94"
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
