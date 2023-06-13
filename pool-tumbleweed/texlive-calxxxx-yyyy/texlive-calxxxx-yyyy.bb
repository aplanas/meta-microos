SUMMARY = "Print a calendar for a group of years"
DESCRIPTION = "The package prints a calendar for two or more years, according \
to a language selection. The package is also 'culture \
dependent' in the sense that it will start weeks according to \
local rules: e.g., weeks conventionally start on Monday in the \
English-speaking world. The package requires array, babel, and \
geometry."
LICENSE = "LPPL-1.0"

PV = "2023.201.20.23asvn65426"

RPM_NAME = "texlive-calxxxx-yyyy-2023.201.20.23asvn65426-52.1.noarch.rpm"
RPM_HASH = "840253b29558d19ac922207af08d2c6b7e7bf11c6eff53a9f8c89ca9ef694758a487ba03fd71148231c342ee7591b39f5944e84f4b96ec8eef7477ac20761b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(calxxxx-yyyy-doc.tex) \
tex(calxxxx-yyyy.tex) \
texlive-calxxxx-yyyy"

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
