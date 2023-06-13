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

PV = "2023.201.0.0.2svn26039"

RPM_NAME = "texlive-vpe-2023.201.0.0.2svn26039-53.1.noarch.rpm"
RPM_HASH = "5ea83773faee850350b84fe48cfbaaa828117bb0643ede4b6bf6f6ad26a82746956bba1dee8fea8e2e24fb174ed66120f96f3fbacfd405a027db8438927c363b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(vpe.sty) \
texlive-vpe"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(Getopt::Long) \
perl(strict) \
sed \
tex(color.sty) \
tex(keyval.sty) \
tex(pifont.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-vpe-bin"

inherit rpm
