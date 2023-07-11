SUMMARY = "A TeX system for publishing in Japanese"
DESCRIPTION = "pTeX adds features related to vertical writing, and deals with \
other problems in typesetting Japanese. A manual (in both \
Japanese and English) is distributed as package pTeX-manual."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-ptex-2023.201.svn66186-53.2.noarch.rpm"
RPM_HASH = "abe687728d9266d6909b853d5d295bf55d4d0d1d097b87426289aa57df77db7ea25d11ba7efe3c505e3289f3864930445fb5610e15e922d5d72bb94f069a646d"
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
