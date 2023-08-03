SUMMARY = "Footnotes in paragraphs"
DESCRIPTION = "Typeset footnotes in run-on paragraphs, instead of one above \
another; this is a re-seating, for the LaTeX environment, of an \
example in the TeXbook. The same basic code, improved for use \
in e-TeX-based LaTeX, appears in the comprehensive footnote \
package footmisc, and superior versions are also available in \
the manyfoot and bigfoot packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25607"

RPM_NAME = "texlive-fnpara-2023.209.svn25607-53.1.noarch.rpm"
RPM_HASH = "690b0a12b056ba4139a4c416f6fe37f7e2ba93db27e10f53a519d113edd0ced5d07bf15b4e6b61a47bc999d545ec1eb12ad116e9a7a1890c2822432ee59fcf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnpara.sty \
texlive-fnpara"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
