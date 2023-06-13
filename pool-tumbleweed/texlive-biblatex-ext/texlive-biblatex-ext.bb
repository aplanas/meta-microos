SUMMARY = "Extended BibLaTeX standard styles"
DESCRIPTION = "The BibLaTeX-ext bundle provides styles that slightly extend \
the standard styles that ship with BibLaTeX. The styles offered \
in this bundle provide a simple interface to change some of the \
stylistic decisions made in the standard styles. At the same \
time they stay as close to their standard counterparts as \
possible, so that most customisation methods can be applied \
here as well."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.16svn63638"

RPM_NAME = "texlive-biblatex-ext-2023.201.0.0.16svn63638-53.1.noarch.rpm"
RPM_HASH = "084591720deef6761609813663c9b51d1c0db9c3bcd9942978f63e4189a966b8b1b2c7cda2cbe16cdff476bd656027cc9cff565178c261d0c09a6d80c1d5227b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-ext-oa-doiapi.sty) \
tex(biblatex-ext-oa.sty) \
tex(biblatex-ext-oasymb-l3draw.sty) \
tex(biblatex-ext-oasymb-pict2e.sty) \
tex(biblatex-ext-oasymb-tikz.sty) \
tex(biblatex-ext-tabular.sty) \
tex(ext-alphabetic-verb.bbx) \
tex(ext-alphabetic-verb.cbx) \
tex(ext-alphabetic.bbx) \
tex(ext-alphabetic.cbx) \
tex(ext-authornumber-comp.bbx) \
tex(ext-authornumber-comp.cbx) \
tex(ext-authornumber-ecomp.bbx) \
tex(ext-authornumber-ecomp.cbx) \
tex(ext-authornumber-tcomp.bbx) \
tex(ext-authornumber-tcomp.cbx) \
tex(ext-authornumber-tecomp.bbx) \
tex(ext-authornumber-tecomp.cbx) \
tex(ext-authornumber-terse.bbx) \
tex(ext-authornumber-terse.cbx) \
tex(ext-authornumber.bbx) \
tex(ext-authornumber.cbx) \
tex(ext-authortitle-common.bbx) \
tex(ext-authortitle-comp.bbx) \
tex(ext-authortitle-comp.cbx) \
tex(ext-authortitle-ibid.bbx) \
tex(ext-authortitle-ibid.cbx) \
tex(ext-authortitle-icomp.bbx) \
tex(ext-authortitle-icomp.cbx) \
tex(ext-authortitle-tcomp.bbx) \
tex(ext-authortitle-tcomp.cbx) \
tex(ext-authortitle-terse.bbx) \
tex(ext-authortitle-terse.cbx) \
tex(ext-authortitle-ticomp.bbx) \
tex(ext-authortitle-ticomp.cbx) \
tex(ext-authortitle.bbx) \
tex(ext-authortitle.cbx) \
tex(ext-authoryear-common.bbx) \
tex(ext-authoryear-comp.bbx) \
tex(ext-authoryear-comp.cbx) \
tex(ext-authoryear-ecomp.bbx) \
tex(ext-authoryear-ecomp.cbx) \
tex(ext-authoryear-ibid.bbx) \
tex(ext-authoryear-ibid.cbx) \
tex(ext-authoryear-icomp.bbx) \
tex(ext-authoryear-icomp.cbx) \
tex(ext-authoryear-iecomp.bbx) \
tex(ext-authoryear-iecomp.cbx) \
tex(ext-authoryear-tcomp.bbx) \
tex(ext-authoryear-tcomp.cbx) \
tex(ext-authoryear-tecomp.bbx) \
tex(ext-authoryear-tecomp.cbx) \
tex(ext-authoryear-terse.bbx) \
tex(ext-authoryear-terse.cbx) \
tex(ext-authoryear-ticomp.bbx) \
tex(ext-authoryear-ticomp.cbx) \
tex(ext-authoryear-tiecomp.bbx) \
tex(ext-authoryear-tiecomp.cbx) \
tex(ext-authoryear.bbx) \
tex(ext-authoryear.cbx) \
tex(ext-biblatex-aux.def) \
tex(ext-dashed-common.bbx) \
tex(ext-numeric-comp.bbx) \
tex(ext-numeric-comp.cbx) \
tex(ext-numeric-verb.bbx) \
tex(ext-numeric-verb.cbx) \
tex(ext-numeric.bbx) \
tex(ext-numeric.cbx) \
tex(ext-standard.bbx) \
tex(ext-verbose-common.cbx) \
tex(ext-verbose-ibid.bbx) \
tex(ext-verbose-ibid.cbx) \
tex(ext-verbose-inote.bbx) \
tex(ext-verbose-inote.cbx) \
tex(ext-verbose-note-common.cbx) \
tex(ext-verbose-note.bbx) \
tex(ext-verbose-note.cbx) \
tex(ext-verbose-trad1.bbx) \
tex(ext-verbose-trad1.cbx) \
tex(ext-verbose-trad2.bbx) \
tex(ext-verbose-trad2.cbx) \
tex(ext-verbose-trad3.bbx) \
tex(ext-verbose-trad3.cbx) \
tex(ext-verbose.bbx) \
tex(ext-verbose.cbx) \
texlive-biblatex-ext"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(alphabetic-verb.bbx) \
tex(alphabetic-verb.cbx) \
tex(alphabetic.bbx) \
tex(alphabetic.cbx) \
tex(authortitle-comp.bbx) \
tex(authortitle-comp.cbx) \
tex(authortitle-ibid.bbx) \
tex(authortitle-ibid.cbx) \
tex(authortitle-icomp.bbx) \
tex(authortitle-icomp.cbx) \
tex(authortitle-tcomp.bbx) \
tex(authortitle-terse.bbx) \
tex(authortitle-ticomp.bbx) \
tex(authortitle.bbx) \
tex(authortitle.cbx) \
tex(authoryear-comp.bbx) \
tex(authoryear-comp.cbx) \
tex(authoryear-ibid.bbx) \
tex(authoryear-ibid.cbx) \
tex(authoryear-icomp.bbx) \
tex(authoryear-icomp.cbx) \
tex(authoryear.bbx) \
tex(authoryear.cbx) \
tex(biblatex.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(kvoptions.sty) \
tex(l3draw.sty) \
tex(l3keys2e.sty) \
tex(numeric-comp.bbx) \
tex(numeric-comp.cbx) \
tex(numeric-verb.bbx) \
tex(numeric-verb.cbx) \
tex(numeric.bbx) \
tex(numeric.cbx) \
tex(pict2e.sty) \
tex(standard.bbx) \
tex(tikz.sty) \
tex(verbose-ibid.bbx) \
tex(verbose-ibid.cbx) \
tex(verbose-inote.bbx) \
tex(verbose-inote.cbx) \
tex(verbose-note.bbx) \
tex(verbose-note.cbx) \
tex(verbose-trad1.bbx) \
tex(verbose-trad1.cbx) \
tex(verbose-trad2.bbx) \
tex(verbose-trad2.cbx) \
tex(verbose-trad3.bbx) \
tex(verbose-trad3.cbx) \
tex(verbose.bbx) \
tex(verbose.cbx) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
