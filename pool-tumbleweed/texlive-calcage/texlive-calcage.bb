SUMMARY = "Calculate the age of something, in years"
DESCRIPTION = "The package calculates the age of someone or something in \
years. Internally it uses the datenumber package to calculate \
the age in days; conversion from days to years is then \
performed, taking care of leap years and such odd things."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.90svn27725"

RPM_NAME = "texlive-calcage-2023.209.0.0.90svn27725-53.1.noarch.rpm"
RPM_HASH = "b9d5d3352067c71320f33112e7306cf1b0f18c0ac2f7b2fbc1ed00f849acc25991d1a963dfd622edb3eebf373402068a0792becbae08cb9ef057efa293848534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calcage.sty \
texlive-calcage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fnumprint.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
