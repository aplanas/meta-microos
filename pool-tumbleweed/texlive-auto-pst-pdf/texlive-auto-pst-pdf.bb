SUMMARY = "Wrapper for pst-pdf (with some psfrag features)"
DESCRIPTION = "The package uses --shell-escape to execute pst-pdf when \
necessary. This makes it especially easy to integrate into the \
workflow of an editor with just 'LaTeX' and 'pdfLaTeX' buttons. \
Wrappers are provided for various psfrag-related features so \
that Matlab figures via laprint, Mathematica figures via \
MathPSfrag, and regular psfrag figures can all be input \
consistently and easily."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn56596"

RPM_NAME = "texlive-auto-pst-pdf-2023.201.0.0.7svn56596-53.1.noarch.rpm"
RPM_HASH = "d008eef338e5c0f1c25ea5df405f565be1c78c3358be4e0b75c8743b1954d0628e2140e89404446694a8d04d7d03473a96e661d95919b4cb1aa6323ddf916b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auto-pst-pdf.sty \
texlive-auto-pst-pdf"

RDEPENDS:${PN} += "/bin/sh \
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
