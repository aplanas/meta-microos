SUMMARY = "Produce knitting charts, in Plain TeX or LaTeX"
DESCRIPTION = "The package provides symbol fonts and commands to write charted \
instructions for cable and lace knitting patterns, using either \
plain TeX or LaTeX. The fonts are available both as Metafont \
source and in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn50782"

RPM_NAME = "texlive-knitting-2023.209.3.0svn50782-56.1.noarch.rpm"
RPM_HASH = "5a86bf8a7993c18de0fa6dad5063d58c11cd4d7a4be0919c0561c78cf386488a43a78e0a20acc796574900e2d1829b6e62e6facb154ee7c78999ce80e36faec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-knitfont.map \
tex-knitg-sc-in.tfm \
tex-knitg-sc-out.tfm \
tex-knitgg.tfm \
tex-knitgn.tfm \
tex-knitgp.tfm \
tex-knitmg.tfm \
tex-knitml.tfm \
tex-knitmn.tfm \
tex-knitmp.tfm \
tex-knitmr.tfm \
tex-knitn-sc-in.tfm \
tex-knitn-sc-out.tfm \
tex-knitnl.tfm \
tex-knitnn.tfm \
tex-knitnp.tfm \
tex-knitnr.tfm \
tex-knitting.sty \
tex-knitting.tex \
tex-knitwg.tfm \
tex-knitwn.tfm \
tex-knitwp.tfm \
tex-uknit.fd \
texlive-knitting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-knitting-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
