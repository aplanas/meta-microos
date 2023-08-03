SUMMARY = "Context sensitive outline elements"
DESCRIPTION = "The package provides 'relative' commands that may be used in \
place of \\chapter, \\section, etc. The documentation shows a \
number of document-management scenarios in which such commands \
are valuable."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn23862"

RPM_NAME = "texlive-coseoul-2023.209.1.1svn23862-55.1.noarch.rpm"
RPM_HASH = "a1a979d1f425e0a0b29440b233223db672554956baf1b9d8d2e31b4b0b3ab452d87a0e5b49f697007be7303762186d071d8a9fe872ca72730accd69b7d2b79b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coseoul.sty \
texlive-coseoul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
