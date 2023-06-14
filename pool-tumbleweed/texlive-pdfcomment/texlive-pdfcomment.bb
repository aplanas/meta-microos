SUMMARY = "A user-friendly interface to pdf annotations"
DESCRIPTION = "For a long time pdfLaTeX has offered the command \\pdfannot for \
inserting arbitrary PDF annotations. However, the command is \
presented in a form where additional knowledge of the \
definition of the PDF format is indispensable. This package is \
an answer to the - occasional - questions in newsgroups, about \
how one could use the comment function of Adobe Reader. At \
least for the writer of LaTeX code, the package offers a \
convenient and user-friendly means of using \\pdfannot to \
provide comments in PDF files. Since version v1.1, \
pdfcomment.sty also supports LaTeX - dvips - ps2pdf, LaTeX - \
dvipdfmx, XeLaTeX and LuaLaTeX. Unfortunately, support of PDF \
annotations by PDF viewers may vary. The reference viewer for \
the development of this package is Adobe Reader."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4asvn49047"

RPM_NAME = "texlive-pdfcomment-2023.201.2.4asvn49047-51.1.noarch.rpm"
RPM_HASH = "40aabf976ba544d7971ea3af98c322887291f09b70b2377f2e9595c876957df884c93745bbe8e2f1449f3cb6b052c15f270bff12866ea9a2a52ce57eeb28094e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcomment.sty \
texlive-pdfcomment"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-luatex85.sty \
tex-marginnote.sty \
tex-refcount.sty \
tex-soulpos.sty \
tex-xkeyval.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
