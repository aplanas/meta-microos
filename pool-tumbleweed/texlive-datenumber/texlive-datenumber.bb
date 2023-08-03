SUMMARY = "Convert a date into a number and vice versa"
DESCRIPTION = "This package provides commands to convert a date into a number \
and vice versa. Additionally there are commands for \
incrementing and decrementing a date. Leap years and the \
Gregorian calendar reform are considered."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn61761"

RPM_NAME = "texlive-datenumber-2023.209.0.0.03svn61761-55.1.noarch.rpm"
RPM_HASH = "1cc4d14a44cc11f6970ae013eb7a1a6ea04ff92960bb8f456876f0ed8ae1de8f26144cc409a8cdf7c1f21aa72878297ed472fffe4f5724285084d3ef3ed3c627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datenumber.sty \
tex-datenumberUSenglish.ldf \
tex-datenumberdummy.ldf \
tex-datenumberenglish.ldf \
tex-datenumberfrench.ldf \
tex-datenumbergerman.ldf \
tex-datenumberspanish.ldf \
texlive-datenumber"

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
