SUMMARY = "Typeset fregean Begriffsschrift"
DESCRIPTION = "The package defines a number of new commands for typesetting \
fregean Begriffsschrift in LaTeX. It is loosely based on the \
package begriff, and offers a number of improvements including \
better relative lengths of the content stroke with respect to \
other strokes, content strokes that point at the middle of \
lines rather than the bottom, a greater width for the assertion \
stroke as compared to the content stroke, a more intuitive \
structure for the conditional, greater care taken to allow for \
the linewidth in the spacing of formulas."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn27417"

RPM_NAME = "texlive-frege-2023.209.1.3svn27417-53.1.noarch.rpm"
RPM_HASH = "9ce22acdb8ad995bcedcaec0af49ca22fa31e5bf60829395897e47342b5112dd9fe52dbe3518a2282ffe2cf1a2dc19fcd1ac2e3b12054c612cdb5e72fa5d0b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frege.sty \
texlive-frege"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-bguq.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
