SUMMARY = "Draw ASCII art of animals saying a specified message"
DESCRIPTION = "The package draws ASCII art of animals saying a specified \
message. The following macros are available: \\ducksay \
\\duckthink \\DefaultAnimal \\AddAnimal \\DucksayOptions Multi-line \
messages are now fully supported. The package comes with two \
versions, choosable with the version key."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn64655"

RPM_NAME = "texlive-ducksay-2023.209.2.6svn64655-53.1.noarch.rpm"
RPM_HASH = "b804641f823437f904b51d58dcc8432c129bb3f1278a1d49425a68e7246a00afc3fe837ac2f4bde8521aac8c8cc4372a242b8957c9cebdc94fb8ffea72565887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ducksay.animals.tex \
tex-ducksay.code.v1.tex \
tex-ducksay.code.v2.tex \
tex-ducksay.sty \
texlive-ducksay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
