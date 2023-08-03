SUMMARY = "Store the name of a defined command in a container"
DESCRIPTION = "The package provides macros for command definition that save \
the name of the command being defined in a file or a macro \
container. The list could be useful for spelling exceptions in \
text editors that do not support TeX syntax."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn24431"

RPM_NAME = "texlive-storecmd-2023.209.0.0.0.2svn24431-58.1.noarch.rpm"
RPM_HASH = "3b12f9058c77b82ade54c1d6c23ec088cc1831c0f7c7b716a0589f62eeb3cf5707120d8ab61371ac12984dd7563f718be62f9455751491ca648937db68fae323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-storecmd.sty \
texlive-storecmd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
tex-ltxtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
