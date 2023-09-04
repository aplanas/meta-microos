SUMMARY = "Create a cross-document bookmark tree"
DESCRIPTION = "The package defines the concept of a document bundle, which is \
a collection of documents that are to be built separately, but \
have a common bookmark tree. The only options are driver \
options, these are dvips (Acrobat Distiller or ps2pdf these can \
be used as the PDF creator), pdfLaTeX (and LuaLaTeX, which is \
treated the same as pdfLaTeX), and XeLaTeX. The package \
auto-detects pdfLaTeX and XeLaTeX, and dvips is the default, so \
there is actually no need to pass the driver option."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53448"

RPM_NAME = "texlive-xbmks-2023.209.svn53448-53.2.noarch.rpm"
RPM_HASH = "35564db90b28803ffd90e2a563ea609679b635cf34e9ec8fdd0d4298f0feaff17d7c624638582daa2ac762f3f1c408839a6f8f276cee25cd746e7132beca0d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xbmks-pdfmark.def \
tex-xbmks-pdftex.def \
tex-xbmks-xetex.def \
tex-xbmks.sty \
texlive-xbmks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
