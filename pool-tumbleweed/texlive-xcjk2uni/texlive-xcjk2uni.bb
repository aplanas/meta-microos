SUMMARY = "Convert CJK characters to Unicode, in pdfTeX"
DESCRIPTION = "The package provides commands to convert CJK characters to \
Unicode in non-UTF-8 encoding; it provides hooks to support \
hyperref in producing correct bookmarks. The bundle also \
provides /ToUnicode mapping file(s) for a CJK subfont; these \
can be used with the cmap package, allowing searches of, and \
cut-and-paste operations on a PDF file generated by pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54958"

RPM_NAME = "texlive-xcjk2uni-2023.201.1.0svn54958-52.2.noarch.rpm"
RPM_HASH = "05a590d3d644b6365f158e013fc888a2218ff9af58c806ce878ca36c5c52f00d0af27ef6f49eb19213f78b1d3aef98b79cca5cfd8fba452e09b675cf050288b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xCJK2uni-UBg5plus.def \
tex-xCJK2uni-UBig5.def \
tex-xCJK2uni-UGB.def \
tex-xCJK2uni-UGBK.def \
tex-xCJK2uni-UJIS.def \
tex-xCJK2uni-UKS.def \
tex-xCJK2uni.sty \
texlive-xcjk2uni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
