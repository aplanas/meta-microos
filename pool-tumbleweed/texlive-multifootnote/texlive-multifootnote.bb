SUMMARY = "Multiple numbers for the same footnote"
DESCRIPTION = "This package provides several commands for generating footnotes \
with multiple numbers (resp. marks)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63456"

RPM_NAME = "texlive-multifootnote-2023.201.svn63456-54.1.noarch.rpm"
RPM_HASH = "e44ad511b014d65cfa0af2c914f84188435f67fa66d7f7b0aa71ba24a468148e7670105fadefefb7ad567070844c952669f7573340d246ce9df07b5046346c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multifootnote.sty \
texlive-multifootnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
