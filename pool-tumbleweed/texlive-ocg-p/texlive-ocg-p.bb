SUMMARY = "PDF OCG support in LaTeX"
DESCRIPTION = "The package provides OCG (Optional Content Groups) support \
within a PDF document, replacing the ocg.sty distributed with \
asymptote. Nested OCGs are supported. The package may be used \
with pdfLaTeX and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn28803"

RPM_NAME = "texlive-ocg-p-2023.201.0.0.4svn28803-54.1.noarch.rpm"
RPM_HASH = "129a57f219d2e40225eef941e8b317d06ea438780ba885685d02430293b93fb7da15143632fbcfa53cb5e2b38e7460d9565649cebf17e9836ff4ef1d19145689"
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
