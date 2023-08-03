SUMMARY = "A font for typesetting the International Phonetic Alphabet (IPA)"
DESCRIPTION = "This package provides the IPA font Doulos SIL in TrueType \
format."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.1svn63255"

RPM_NAME = "texlive-doulossil-2023.209.0.0.1svn63255-53.1.noarch.rpm"
RPM_HASH = "8cb7b8e1e8773217eb6a9c70746a1f4505ba02d651a98a10107ea4bfbc3f0d767ae878b6092d46ffe2714ca7dab96b0f42d878d2886817af0bf364a1a5d587e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doulossil"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-doulossil-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
