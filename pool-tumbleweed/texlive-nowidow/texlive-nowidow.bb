SUMMARY = "Avoid widows"
DESCRIPTION = "This package provides a useful macro to manage widow lines."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24066"

RPM_NAME = "texlive-nowidow-2023.209.1.0svn24066-55.1.noarch.rpm"
RPM_HASH = "703579af1f11c334c26bcae8bf85bdadeba6416a2a311f8db62d50b32e0120c1a72afcdb1c9df95b4cfd9fe64e0400021447a0570b882f41a64cd06f038abc9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nowidow.sty \
texlive-nowidow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
