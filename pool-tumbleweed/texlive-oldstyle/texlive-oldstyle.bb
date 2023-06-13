SUMMARY = "Old style numbers in OT1 encoding"
DESCRIPTION = "Font information needed to load the cmmi and cmmib fonts for \
use to produce oldstyle numbers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-oldstyle-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "c4366849afcf6db8207f18643433a358e74ea013b5d7d0723ceef0b364b6557a8fb87014d5d1f23d0882805fd456198085e1ffa698b55e7ad059b4b4edc39141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Ucmm.fd) \
tex(oldstyle.sty) \
texlive-oldstyle"

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
