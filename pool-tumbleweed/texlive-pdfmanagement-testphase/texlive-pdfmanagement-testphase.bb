SUMMARY = "LaTeX PDF management testphase bundle"
DESCRIPTION = "This is a temporary package, which is used during a test phase \
to load the new PDF management code of LaTeX. The new PDF \
management code offers backend-independent interfaces to \
central PDF dictionaries, tools to create annotations, form \
Xobjects, to embed files, and to handle PDF standards. The code \
is provided, during a testphase, as an independent package to \
allow users and package authors to safely test the code. At a \
later stage it will be integrated into the LaTeX kernel (or in \
parts into permanent support packages), and the current \
testphase bundle will be removed."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.95xsvn66532"

RPM_NAME = "texlive-pdfmanagement-testphase-2023.209.0.0.95xsvn66532-52.1.noarch.rpm"
RPM_HASH = "a01704cd4ff7f803aa82fc7d19bb2b24c0ca51f5d78f9b76f711ebc8037ef62158a5b030f9f9b4fbc2017b6fae91d74d52ce6e93a55f14885b7abd73114ac383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color-ltx.sty \
tex-colorspace-patches-tmp-ltx.sty \
tex-hgeneric-testphase.def \
tex-hyperref-colorschemes.def \
tex-l3backend-testphase-dvipdfmx.def \
tex-l3backend-testphase-dvips.def \
tex-l3backend-testphase-dvisvgm.def \
tex-l3backend-testphase-luatex.def \
tex-l3backend-testphase-pdftex.def \
tex-l3backend-testphase-xetex.def \
tex-l3pdffield-testphase.sty \
tex-l3ref-tmp.sty \
tex-output-patches-tmp-ltx.sty \
tex-pdfmanagement-firstaid.sty \
tex-pdfmanagement-testphase.sty \
tex-xcolor-patches-tmp-ltx.sty \
texlive-pdfmanagement-testphase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-l3draw.sty \
tex-tagpdf-base.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
