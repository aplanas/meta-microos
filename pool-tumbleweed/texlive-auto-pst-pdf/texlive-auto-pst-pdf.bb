SUMMARY = "Wrapper for pst-pdf (with some psfrag features)"
DESCRIPTION = "The package uses --shell-escape to execute pst-pdf when \
necessary. This makes it especially easy to integrate into the \
workflow of an editor with just 'LaTeX' and 'pdfLaTeX' buttons. \
Wrappers are provided for various psfrag-related features so \
that Matlab figures via laprint, Mathematica figures via \
MathPSfrag, and regular psfrag figures can all be input \
consistently and easily."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn56596"

RPM_NAME = "texlive-auto-pst-pdf-2023.209.0.0.7svn56596-54.1.noarch.rpm"
RPM_HASH = "661b2c4fdba1dc537554eed0f53268a2adcb0482ccdd594e6983a992254affd6b79f58731cda77ace060200374417e732ef3f967e5594e4bce37db6c8dd56fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auto-pst-pdf.sty \
texlive-auto-pst-pdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-pst-pdf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-ifplatform \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
