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

PV = "2023.201.svn59477"

RPM_NAME = "texlive-eq-pin2corr-2023.201.svn59477-53.1.noarch.rpm"
RPM_HASH = "e489fc630e276c656e898ba177e69c994167dd9972aa0b51e13ed0b0ee37dc4d7af8a3bf5b13a4bc0d516dfdecae8bbfa4987bf4f718d237c8960669a590d1b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eq-pin2corr.sty) \
texlive-eq-pin2corr"

RDEPENDS:${PN} += "/bin/sh \
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
