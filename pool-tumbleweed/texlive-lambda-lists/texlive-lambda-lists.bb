SUMMARY = "Lists in TeX's mouth"
DESCRIPTION = "These list-processing macros avoid the reassignments employed \
in the macros shown in Appendix D of the TeXbook: all the \
manipulations take place in what Knuth is pleased to call \
'TeX's mouth'."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn31402"

RPM_NAME = "texlive-lambda-lists-2023.209.svn31402-56.1.noarch.rpm"
RPM_HASH = "410cc3d11911fa751602314812dd10283abfb9f137647bd0fabe4dcae49cc7cf442ec4a341689d00d4aa7c9e49be3fdd643349c34b2afddcab2c920f625565ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lambda.sty \
texlive-lambda-lists"

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
