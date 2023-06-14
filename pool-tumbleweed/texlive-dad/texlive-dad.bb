SUMMARY = "Simple typesetting system for mixed Arabic/Latin documents"
DESCRIPTION = "This package allows simple typesetting in Arabic script, \
intended for mixed Arabic/Latin script usage in situations \
where heavy-duty solutions are discouraged. The system operates \
with both Unicode and transliterated input, allowing the user \
to choose the most appropriate approach for every situation."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2svn54191"

RPM_NAME = "texlive-dad-2023.204.1.2svn54191-54.1.noarch.rpm"
RPM_HASH = "47eae8d5983c9fce74102a6db75df2c337a5801f53de156406d0b89a2d351ed50768d9b264bb7f3b842aa844e1f8b9233fdd957e85b231869a07c3e268924766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OT1dad.fd \
tex-T1dad.fd \
tex-dad.map \
tex-dad.sty \
tex-dadreal.tfm \
tex-dadrealbold.tfm \
tex-dadrealmono.tfm \
texlive-dad"

RDEPENDS:${PN} += "/bin/sh \
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
