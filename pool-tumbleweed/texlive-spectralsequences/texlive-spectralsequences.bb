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

PV = "2023.201.1.3.3svn65667"

RPM_NAME = "texlive-spectralsequences-2023.201.1.3.3svn65667-57.1.noarch.rpm"
RPM_HASH = "4bfcfc643cb9baa4d19a29ddfbe7958b870f17c8a39c3bd4f6dee9dd6ea386ebf41e035df2cc1d822a80226383e49c290b6c4785f4a6b2ce1051b57f104bfd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spectralsequences.sty) \
tex(sseqcheckdefinitions.code.tex) \
tex(sseqdrawing.code.tex) \
tex(sseqforeach.code.tex) \
tex(sseqkeys.code.tex) \
tex(sseqloadstore.code.tex) \
tex(sseqmacromakers.code.tex) \
tex(sseqmain.code.tex) \
tex(sseqmessages.code.tex) \
tex(sseqparsers.code.tex) \
texlive-spectralsequences"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(pdfcomment.sty) \
tex(tikz.sty) \
tex(verbatim.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
