SUMMARY = "Curriculum vitae for French use"
DESCRIPTION = "The package allows the user to set up a curriculum vitae as a \
French employer will expect."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59638"

RPM_NAME = "texlive-esieecv-2023.209.svn59638-54.2.noarch.rpm"
RPM_HASH = "f83386b9736c92db7d749f1d853d4cfcdc102e71dfb780e67f042158eef28962a6848b2236687289d63e9103bf9633c18d65e3623649d1847394882338a8727c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ESIEEcv.sty \
texlive-esieecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
