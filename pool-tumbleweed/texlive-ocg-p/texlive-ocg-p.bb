SUMMARY = "PDF OCG support in LaTeX"
DESCRIPTION = "The package provides OCG (Optional Content Groups) support \
within a PDF document, replacing the ocg.sty distributed with \
asymptote. Nested OCGs are supported. The package may be used \
with pdfLaTeX and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn28803"

RPM_NAME = "texlive-ocg-p-2023.209.0.0.4svn28803-55.1.noarch.rpm"
RPM_HASH = "f01336b6ea266ba929bb139731926866b7d88bdb4c91375d4725db0ea6717c3fdf920622eaf8b464417f1042fba0b38ade51e01565856a790346cb308c5de90d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocg-p.sty \
texlive-ocg-p"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-eso-pic.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-listings.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
