SUMMARY = "Print spectral sequence diagrams using PGF/TikZ"
DESCRIPTION = "The package is a specialized tool built on top of PGF/TikZ for \
drawing spectral sequences. It provides a powerful, concise \
syntax for specifying the data of a spectral sequence, and then \
allows the user to print various pages of spectral sequences, \
automatically choosing which subset of the classes, \
differentials, and structure lines to display on each page. It \
also handles most of the details of the layout. At the same \
time, it is extremely flexible. spectralsequences is closely \
integrated with TikZ to ensure that users can take advantage of \
as much as possible of its expressive power. It is possible to \
turn off most of the automated layout features and draw \
replacements using TikZ commands. The package also provides a \
carefully designed error reporting system intended to ensure \
that it is as clear as possible what is going wrong."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.3svn65667"

RPM_NAME = "texlive-spectralsequences-2023.209.1.3.3svn65667-58.1.noarch.rpm"
RPM_HASH = "4adca27e6e345693e7f912d6e65e770c6f9476ac47b979d3464e66ef5525a25a79f88833e8718ff7e9426fc28eac25041985d365302848476873ffceb73f195c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spectralsequences.sty \
tex-sseqcheckdefinitions.code.tex \
tex-sseqdrawing.code.tex \
tex-sseqforeach.code.tex \
tex-sseqkeys.code.tex \
tex-sseqloadstore.code.tex \
tex-sseqmacromakers.code.tex \
tex-sseqmain.code.tex \
tex-sseqmessages.code.tex \
tex-sseqparsers.code.tex \
texlive-spectralsequences"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pdfcomment.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
