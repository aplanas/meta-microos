SUMMARY = "Australian Defence Force Academy thesis format"
DESCRIPTION = "The bundle includes a BibTeX style file."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.42svn26048"

RPM_NAME = "texlive-adfathesis-2023.209.2.42svn26048-55.1.noarch.rpm"
RPM_HASH = "706e99193a959d3e6ae3f19dd9582a4b03d1225a6bd324ce1921aa2a97fa0f2c4390a05fb6031c39062762da4defde45f5de1337ed519ba2707bfb1ecc74bde6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adfathesis.cls \
texlive-adfathesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-harvard.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
