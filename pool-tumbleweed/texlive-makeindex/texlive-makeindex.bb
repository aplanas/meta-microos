SUMMARY = "Makeindex development sources"
DESCRIPTION = "The package contains the development sources of makeindex, as \
derived from the texlive subversion repository."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn62517"

RPM_NAME = "texlive-makeindex-2023.208.svn62517-53.1.noarch.rpm"
RPM_HASH = "135a5e9cc8f3034d720a71a2c5be0322a2ac89a1ec4b8b23a962bbe1b3fe1565afd198b49d8eb6adb759883d438e46fcc55be7274cfeb0694513a17087453f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxmac.tex \
texlive-makeindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-makeindex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
