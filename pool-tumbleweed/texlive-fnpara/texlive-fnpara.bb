SUMMARY = "Footnotes in paragraphs"
DESCRIPTION = "Typeset footnotes in run-on paragraphs, instead of one above \
another; this is a re-seating, for the LaTeX environment, of an \
example in the TeXbook. The same basic code, improved for use \
in e-TeX-based LaTeX, appears in the comprehensive footnote \
package footmisc, and superior versions are also available in \
the manyfoot and bigfoot packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25607"

RPM_NAME = "texlive-fnpara-2023.201.svn25607-52.1.noarch.rpm"
RPM_HASH = "4bd23e57289dc5de932176671091e84ea764a63be802e1c63149c0f4b98a560d7ae14043216a0e0268631565f11c48bd6ae047ac834bafe917e0c0be9621b1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnpara.sty \
texlive-fnpara"

RDEPENDS:${PN} += "/bin/sh \
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
