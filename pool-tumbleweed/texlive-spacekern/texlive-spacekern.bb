SUMMARY = "Kerning between words and against space"
DESCRIPTION = "This package provides two shorthands for typesetting breaking \
and non-breaking small spaces, where both hyphenation and \
kerning against space are correctly applied. Additionally, \
interword kerning can be applied."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn63552"

RPM_NAME = "texlive-spacekern-2023.201.0.0.1asvn63552-57.1.noarch.rpm"
RPM_HASH = "4492b16aa54e8edd4294c53a914b39b23bb498c7bdecbf7d8b8540d9d0f10595e4fb544e0426bc8e1145ee178d27318927e7f3ccf4ae08879a6b14b1eadfc1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spacekern.sty \
texlive-spacekern"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
