SUMMARY = "Local allocation macros for LaTeX 2015"
DESCRIPTION = "Local allocation macros, with names taken from etex.sty but \
with implementation based on the LaTeX 2015 allocation macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-2023.209.0.0.03svn42712-54.2.noarch.rpm"
RPM_HASH = "f5b69e0eefe52a0de496ca77ec3df39992d509fb92bb84f889d4cc26a5bb4920b67f84688d7e1c9f05b261d9df8fb8bda4275795a48e166591bbbb352f6ebf38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elocalloc.sty \
texlive-elocalloc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
