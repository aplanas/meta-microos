SUMMARY = "Provide file modification times, and compare them"
DESCRIPTION = "The package provides macros to read and compare the \
modification dates of files. The files may be .tex files, \
images or other files (as long as they can be found by LaTeX). \
It uses the \\pdffilemoddate primitive of pdfLaTeX to find the \
file modification date as PDF date string, parses the string \
and returns the value to the user. The package will also work \
for DVI output with recent versions of the LaTeX compiler which \
uses pdfLaTeX in DVI mode. The functionality is provided by \
purely expandable macros or by faster but non-expandable ones."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64967"

RPM_NAME = "texlive-filemod-2023.201.1.2svn64967-52.1.noarch.rpm"
RPM_HASH = "360a868081cc4b928fe990e9780ca651fde48fd8a8e235a5fad8017dfb218edca906c22e61ae350437551473ac40dc65f802de687d2806ce67a602a4a234207b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filemod-expmin.sty \
tex-filemod-expmin.tex \
tex-filemod.sty \
tex-filemod.tex \
texlive-filemod"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
