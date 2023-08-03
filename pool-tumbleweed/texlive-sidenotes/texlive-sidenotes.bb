SUMMARY = "Typeset notes containing rich content, in the margin"
DESCRIPTION = "The package allows typesetting of texts with notes, figures, \
citations, captions and tables in the margin. This is common \
(for example) in science text books."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00asvn54524"

RPM_NAME = "texlive-sidenotes-2023.209.1.00asvn54524-54.1.noarch.rpm"
RPM_HASH = "091d129166bfd28af5bbb34d53366f0fe26a9bf4e7e9eeb8c1758ae1d4460fb92dc0bffba6e6bc94596f286257e765e2816c18213a0df66789836100bf5eeca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-caesar-book.cls \
tex-sidenotes.sty \
texlive-sidenotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-beramono.sty \
tex-caption.sty \
tex-changepage.sty \
tex-color.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-marginfix.sty \
tex-marginnote.sty \
tex-mathpazo.sty \
tex-mhchem.sty \
tex-microtype.sty \
tex-morefloats.sty \
tex-ragged2e.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
