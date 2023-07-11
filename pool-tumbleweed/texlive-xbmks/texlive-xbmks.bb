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

PV = "2023.201.svn53448"

RPM_NAME = "texlive-xbmks-2023.201.svn53448-52.2.noarch.rpm"
RPM_HASH = "aa7dc6f21b2711e46d450f02430127552be9e92229eddd5ab7f307480002aae62701818694230cd27852e1db4938b10aec365a5acb5734a9a723a396c8afa54d"
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
