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

RPM_NAME = "texlive-eq-pin2corr-2023.201.svn59477-53.2.noarch.rpm"
RPM_HASH = "44c1fecac6ad223803607227fda9ad2dc1a3d452b61d30ad2e87752fe1777fe51caf7d392349a575001dee63f0ea51dd7194309cb6b4453e88f241b3c000ad8a"
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
