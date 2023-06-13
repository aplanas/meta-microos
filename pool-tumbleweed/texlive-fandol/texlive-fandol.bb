SUMMARY = "Four basic fonts for Chinese typesetting"
DESCRIPTION = "Fandol fonts designed for Chinese typesetting. The current \
version contains four styles: Song, Hei, Kai, Fang. All fonts \
are in OpenType format."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn37889"

RPM_NAME = "texlive-fandol-2023.201.0.0.3svn37889-52.1.noarch.rpm"
RPM_HASH = "826ff7fe36e403271395da7ae94fdf3b3c276fc0e2d83091017dcd26a6beaa007f3cc29c21518dc783dd51e284d4a5aaaf44b32bff5631829c6ec8890666b155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fandol"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-fandol-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
