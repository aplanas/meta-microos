SUMMARY = "TeX Live manual (Italian)"
DESCRIPTION = "The texlive-it package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58653"

RPM_NAME = "texlive-texlive-it-2023.209.svn58653-55.1.noarch.rpm"
RPM_HASH = "8264352257bc1fd3d9ff334828c039a36ab6ef5cb290b1f39ff7a2734f6231fb98941587788f62873815f66b54cbc41860069f6954316c883b1dea0adf491580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-it"

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
