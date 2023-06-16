SUMMARY = "Makes the style and command of moderncv (style classic) available for koma-classes and thus compatible with BibLaTeX"
DESCRIPTION = "This package provides an imitation of the moderncv class with \
the classic style (by Xavier Danaux), to be used in conjunction \
with the koma-classes. Thus it is possible to configure \
pagelayout, headings etc. the way it is done in koma-classes. \
Moreover, it is possible to use BibLaTeX, while the original \
moderncv-class is incompatible with BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn25025"

RPM_NAME = "texlive-koma-moderncvclassic-2023.201.0.0.5svn25025-55.1.noarch.rpm"
RPM_HASH = "c06642342eb822a364000b8ebd1202d66746263c6f928e0555a1a34f78884e98b15e583137f5ed204926988381abff14d56c0a0b4aad435f19e654577df79dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-koma-moderncvclassic.sty \
texlive-koma-moderncvclassic"

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
