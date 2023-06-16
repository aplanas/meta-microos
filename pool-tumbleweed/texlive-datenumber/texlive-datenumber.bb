SUMMARY = "Convert a date into a number and vice versa"
DESCRIPTION = "This package provides commands to convert a date into a number \
and vice versa. Additionally there are commands for \
incrementing and decrementing a date. Leap years and the \
Gregorian calendar reform are considered."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn61761"

RPM_NAME = "texlive-datenumber-2023.204.0.0.03svn61761-54.1.noarch.rpm"
RPM_HASH = "b0d59b7f326dc047605206ed945d8ea5b3e9caab4636bd0a39f0c0745fcef214bc4617847367542df1b359a01b106507e84c4aeb68f21fddd9726110bf486a24"
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
