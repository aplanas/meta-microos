SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the \
self-locating feature required for movable installations, \
layered on top of a general search mechanism. It is not \
distributed separately, but rather is released and maintained \
as part of the TeX Live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn66209"

RPM_NAME = "texlive-kpathsea-2023.209.svn66209-56.1.noarch.rpm"
RPM_HASH = "9b52528360b523a65096a9d7109628e9c33c69364d0033aa27eca6f7f65a5a8084a2c2baf7ea828e241be652d576dcf168ac01ccc7df53ff75eb4837148fc4ce"
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
