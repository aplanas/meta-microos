SUMMARY = "Ralph Smith's Formal Script font"
DESCRIPTION = "The fonts provide uppercase 'formal' script letters for use as \
symbols in scientific and mathematical typesetting (in contrast \
to the informal script fonts such as that used for the \
'calligraphic' symbols in the TeX maths symbol font). The fonts \
are provided as Metafont source, and as derived Adobe Type 1 \
format. LaTeX support, for using these fonts in mathematics, is \
available via one of the packages calrsfs and mathrsfs."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rsfs-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "87d53a2d7cb268dc26afb902f9179d1cc9dd0cfba85f747e42e7055a521a1c57c3815e6273a6594926f970a6274cf3912c01e88e4b66059c5143d436f033cfb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rsfs.map \
tex-rsfs10.tfm \
tex-rsfs5.tfm \
tex-rsfs7.tfm \
tex-scrload.tex \
texlive-rsfs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rsfs-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
