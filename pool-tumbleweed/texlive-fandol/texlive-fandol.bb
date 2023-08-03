SUMMARY = "Four basic fonts for Chinese typesetting"
DESCRIPTION = "Fandol fonts designed for Chinese typesetting. The current \
version contains four styles: Song, Hei, Kai, Fang. All fonts \
are in OpenType format."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn37889"

RPM_NAME = "texlive-fandol-2023.209.0.0.3svn37889-53.1.noarch.rpm"
RPM_HASH = "c4638ffa31f3a7d6af83276918f8e6c8ee5e4128e83aeec02014445ef7bc584d5cccb00b4f28817c06991614fa0c9c0a8fa2cf2e9a3231304270a56b5b82339a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fandol"

RDEPENDS:${PN} += "/usr/bin/sh \
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
