SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the \
self-locating feature required for movable installations, \
layered on top of a general search mechanism. It is not \
distributed separately, but rather is released and maintained \
as part of the TeX Live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn66209"

RPM_NAME = "texlive-kpathsea-2023.201.svn66209-55.1.noarch.rpm"
RPM_HASH = "5cb41dbe33c338cb0f07fe317ed3756f12f7715dfe4dd1ae216046f6bc7588332c9cec4a6beacd795fe70a9b44f80fb662c330d422e7c195f99c34df10232a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-kpathsea \
tex-fmtutil.cnf \
tex-mktex.cnf \
tex-texmf.cnf \
texlive-kpathsea"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
diffutils \
ed \
findutils \
grep \
sed \
texlive-filesystem \
texlive-gsftopk \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-updmap-map"

inherit rpm
