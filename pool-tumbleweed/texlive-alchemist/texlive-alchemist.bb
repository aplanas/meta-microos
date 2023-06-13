SUMMARY = "Typeset alchemist and astrological symbols"
DESCRIPTION = "This style file makes the alchemical and astrological symbols \
accessible in Unicode."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.00svn66548"

RPM_NAME = "texlive-alchemist-2023.201.1.00svn66548-54.1.noarch.rpm"
RPM_HASH = "af3cee9f97e8c7183021ff96f236b9f8b9bbfe6ae4710d11e549d6b7e4ecad14b3bad607f0a4ed12f424261895304963d6c96d3ebd11cd0cc9b695789156efe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(alchemist.sty) \
texlive-alchemist"

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
