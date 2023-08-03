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

RPM_NAME = "texlive-eq-pin2corr-2023.209.svn59477-54.1.noarch.rpm"
RPM_HASH = "1624cc97fe6df2639bec321939af3bb01588f91de9cfe636b47539f3636d754297898e11c78a851d2cf1b364d4249e44c3bea78796696cfb4c98a42c4726e5ef"
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
