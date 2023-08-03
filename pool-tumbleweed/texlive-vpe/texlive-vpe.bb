SUMMARY = "Source specials for PDF output"
DESCRIPTION = "VPE is a system to make the equivalent of 'source special' \
marks in a PDF file. Clicking on a mark will activate an \
editor, pointing at the source line that produced the text that \
was marked. The system comprises a perl file (vpe.pl) and a \
LaTeX package (vpe.sty); it will work with PDF files generated \
via LaTeX/dvips, pdfTeX (version 0.14 or better), and \
LaTeX/VTeX. Using the LaTeX/dvips or pdfLaTeX routes, the \
(pdf)TeX processor should be run with shell escapes enabled."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn26039"

RPM_NAME = "texlive-vpe-2023.209.0.0.2svn26039-54.1.noarch.rpm"
RPM_HASH = "3bcfca21ef0e75f11a926e1ddb8bdee275c9c91b7883ea7cd67b96a96fb68e04f7ae0342fd5507309d72b7a296e10622a6677bd69c459ecf5dd20f100877d041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vpe.sty \
texlive-vpe"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-Getopt--Long \
perl-strict \
sed \
tex-color.sty \
tex-keyval.sty \
tex-pifont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-vpe-bin"

inherit rpm
