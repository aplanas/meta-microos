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

PV = "2023.209.2.4asvn49047"

RPM_NAME = "texlive-pdfcomment-2023.209.2.4asvn49047-52.1.noarch.rpm"
RPM_HASH = "d70fdfe7733230c86153da4b8f039197e7d6df3dd69e5eb6bc9e6b2f46b26f4b01f76ae451f5b626285ad6c4bcc1338424d767afe58bae24554c8061ddc31d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcomment.sty \
texlive-pdfcomment"

RDEPENDS:${PN} += "/usr/bin/sh \
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
