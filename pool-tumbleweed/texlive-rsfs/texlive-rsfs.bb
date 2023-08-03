SUMMARY = "Ralph Smith's Formal Script font"
DESCRIPTION = "The fonts provide uppercase 'formal' script letters for use as \
symbols in scientific and mathematical typesetting (in contrast \
to the informal script fonts such as that used for the \
'calligraphic' symbols in the TeX maths symbol font). The fonts \
are provided as Metafont source, and as derived Adobe Type 1 \
format. LaTeX support, for using these fonts in mathematics, is \
available via one of the packages calrsfs and mathrsfs."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rsfs-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "8fa413406853d0417bd9b39a9b402f4f17310eeac2e74388a32b84d7b659eedafaa24ccb2f88c79ca57cb820974aef5e0c8fd9dba62ed36797ab3d705d7daf4e"
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
