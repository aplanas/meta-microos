SUMMARY = "A collection of packages and classes"
DESCRIPTION = "The bundle provides new document classes for technical \
documents, thesis works, manuscripts and lecture notes; many \
mathematical packages providing a large number of macros for \
mathematical texts; layout providing a non-empty parskip with \
extended length corrections and new section definition \
commands; easy label creation for counters; and german language \
tools and predefined abbreviations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn26055"

RPM_NAME = "texlive-akktex-2023.209.0.0.3.2svn26055-55.1.noarch.rpm"
RPM_HASH = "6ee93444c1b7d26e0d8e8511bca73e2fac3ef524e2fae3e464f80dfd0a64acc8b124cc6d977629d70bb9fc9f9cfc602f3202b42e1baa5bbacbe325dbf630ee57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-akkconditional.sty \
tex-akkcounterlabelpattern.sty \
tex-akkcs.sty \
tex-akkdoc.sty \
tex-akkgerman.sty \
tex-akkgermanabbreviations.sty \
tex-akklecture.cls \
tex-akklongpage.sty \
tex-akkmath.sty \
tex-akkmathbasic.sty \
tex-akkmathdisc.sty \
tex-akkmathfun.sty \
tex-akkmathnum.sty \
tex-akkmathpaper.sty \
tex-akkmathproof.sty \
tex-akkmathrel.sty \
tex-akkmathset.sty \
tex-akkmathtext.sty \
tex-akknum.sty \
tex-akkparskip.sty \
tex-akkscript.cls \
tex-akksection.sty \
tex-akkstring.sty \
tex-akktecdoc.cls \
tex-akktex.sty \
tex-akkwidepage.sty \
texlive-akktex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amstext.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-book.cls \
tex-calc.sty \
tex-enumerate.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-latexsym.sty \
tex-longtable.sty \
tex-lscape.sty \
tex-theorem.sty \
tex-verbatim.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
