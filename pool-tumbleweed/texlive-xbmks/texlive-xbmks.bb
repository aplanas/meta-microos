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

RPM_NAME = "texlive-xbmks-2023.201.svn53448-52.1.noarch.rpm"
RPM_HASH = "2ee65074095f473572ee43c51a1a57434ba7fa7ab4e03d65db3be6ae31f31ca633eb6550c34a1c00ec143e6e580af0e97f7c8d28a70ca0d5760d32e690ddb45b"
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
