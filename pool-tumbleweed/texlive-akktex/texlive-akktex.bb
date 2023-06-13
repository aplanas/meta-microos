SUMMARY = "A collection of packages and classes"
DESCRIPTION = "The bundle provides new document classes for technical \
documents, thesis works, manuscripts and lecture notes; many \
mathematical packages providing a large number of macros for \
mathematical texts; layout providing a non-empty parskip with \
extended length corrections and new section definition \
commands; easy label creation for counters; and german language \
tools and predefined abbreviations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn26055"

RPM_NAME = "texlive-akktex-2023.201.0.0.3.2svn26055-54.1.noarch.rpm"
RPM_HASH = "8be98f05c47d6165dba7373bda52c964ccc3aede274eb79874b6eff38d93b4404504c3f2462b2044ec086ac5909321b042242f812bf6ff1d78c3e6b9096015e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(akkconditional.sty) \
tex(akkcounterlabelpattern.sty) \
tex(akkcs.sty) \
tex(akkdoc.sty) \
tex(akkgerman.sty) \
tex(akkgermanabbreviations.sty) \
tex(akklecture.cls) \
tex(akklongpage.sty) \
tex(akkmath.sty) \
tex(akkmathbasic.sty) \
tex(akkmathdisc.sty) \
tex(akkmathfun.sty) \
tex(akkmathnum.sty) \
tex(akkmathpaper.sty) \
tex(akkmathproof.sty) \
tex(akkmathrel.sty) \
tex(akkmathset.sty) \
tex(akkmathtext.sty) \
tex(akknum.sty) \
tex(akkparskip.sty) \
tex(akkscript.cls) \
tex(akksection.sty) \
tex(akkstring.sty) \
tex(akktecdoc.cls) \
tex(akktex.sty) \
tex(akkwidepage.sty) \
texlive-akktex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amstext.sty) \
tex(array.sty) \
tex(article.cls) \
tex(babel.sty) \
tex(book.cls) \
tex(calc.sty) \
tex(enumerate.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(inputenc.sty) \
tex(latexsym.sty) \
tex(longtable.sty) \
tex(lscape.sty) \
tex(theorem.sty) \
tex(verbatim.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
