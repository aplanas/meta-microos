SUMMARY = "Simple typesetting system for mixed Arabic/Latin documents"
DESCRIPTION = "This package allows simple typesetting in Arabic script, \
intended for mixed Arabic/Latin script usage in situations \
where heavy-duty solutions are discouraged. The system operates \
with both Unicode and transliterated input, allowing the user \
to choose the most appropriate approach for every situation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54191"

RPM_NAME = "texlive-dad-2023.209.1.2svn54191-55.1.noarch.rpm"
RPM_HASH = "7ccff2ad7b7b77647f7faea07dc679696b69a9e0a09ac2dd0519273e30360db40a8aff7e8f328b0d08d3279a319f020c216d14e7d9e6fe6b836c5c92ba191747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OT1dad.fd \
tex-T1dad.fd \
tex-dad.map \
tex-dad.sty \
tex-dadreal.tfm \
tex-dadrealbold.tfm \
tex-dadrealmono.tfm \
texlive-dad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatex85.sty \
tex-updmap.cfg \
texlive \
texlive-dad-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
