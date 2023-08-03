SUMMARY = "Adaptable tables"
DESCRIPTION = "The package allows data, text (including (La)TeX commands or \
environments) to be formatted into a array which may be split."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30991"

RPM_NAME = "texlive-nox-2023.209.1.0svn30991-55.1.noarch.rpm"
RPM_HASH = "07a260d5e73a5d749ffbf8f9ba64cdc14c127fb2ee5646c0dcc7373da7f585545ef0739fe25ec4ce1c2a2cb479ab6242466ac25119ea6e3d3d6fefb22aad61fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nox.sty \
texlive-nox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
