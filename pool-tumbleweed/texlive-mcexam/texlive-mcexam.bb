SUMMARY = "Create randomized Multiple Choice questions"
DESCRIPTION = "This LaTeX package automatically randomly permutes the order of \
questions as well as the answer options in different versions \
of a multiple choice exam/test. Next to the exam versions \
themselves, the package also allows printing a concept version \
of the exam, a key table with the correct answers or points, \
and a document with solutions and explanations per exam \
version. The package also allows writing an R code which \
processes the results of the exam and calculates the grades. \
The following other LaTeX packages are required: enumitem, \
environ, etoolbox, longtable, newfile, pgffor (from the \
PGF/TikZ bundle), xkeyval, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn60481"

RPM_NAME = "texlive-mcexam-2023.208.0.0.5svn60481-53.1.noarch.rpm"
RPM_HASH = "1049dbb92b76bd25121554b4e3c57efdcb45253c747dbdc8f9bada4527dc982694195fe8aa231fd23ccc560a3934e7951475056e675ded36ad8d3f351e888e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcexam.sty \
texlive-mcexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-longtable.sty \
tex-newfile.sty \
tex-pgffor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
