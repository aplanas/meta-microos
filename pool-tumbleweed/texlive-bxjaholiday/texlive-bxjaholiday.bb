SUMMARY = "Support for Japanese holidays"
DESCRIPTION = "This LaTeX package provides a command to convert dates to names \
of Japanese holidays. Another command, converting dates to the \
day of the week in Japanese, is available as a free gift. \
Further (lower-level) APIs are provided for expl3. The package \
supports pdfTeX, XeTeX, LuaTeX, pTeX, and upTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn60636"

RPM_NAME = "texlive-bxjaholiday-2023.209.1.1.1svn60636-53.1.noarch.rpm"
RPM_HASH = "77882623f4ac57a84fc2bbe9091e6627c3c9ec6b6cdbce5528c0c5a2542708101e03f36e3b75b64301994ba893d9e618bec3c3a09c077ac21dffbad065da1c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxjaholiday.sty \
texlive-bxjaholiday"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
