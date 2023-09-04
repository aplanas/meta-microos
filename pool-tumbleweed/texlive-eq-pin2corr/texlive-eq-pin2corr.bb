SUMMARY = "Add PIN security to the 'Correct' button of a quiz created by exerquiz"
DESCRIPTION = "This package is an add-on to the quiz environment of the \
exerquiz package (part of the acrotex bundle). It adds PIN \
security to a quiz created by the quiz environment. To correct \
a quiz, the document consumer must press the 'Correct' button \
of the quiz and successfully enter the correct PIN number. The \
PIN security is designed for the instructor to mark and record \
the student's effort on that quiz. The package works for the \
usual workflows."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59477"

RPM_NAME = "texlive-eq-pin2corr-2023.209.svn59477-54.2.noarch.rpm"
RPM_HASH = "2d2e47a231a51b82dad767df38b18543efd9d448f49fb5918ed292dda364682d18fb02ec9af30f31c5390e6d8510a241952ef947d36a8c0e346cc96abcd6b844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eq-pin2corr.sty \
texlive-eq-pin2corr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
