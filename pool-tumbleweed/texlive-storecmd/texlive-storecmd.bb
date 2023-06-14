SUMMARY = "Store the name of a defined command in a container"
DESCRIPTION = "The package provides macros for command definition that save \
the name of the command being defined in a file or a macro \
container. The list could be useful for spelling exceptions in \
text editors that do not support TeX syntax."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn24431"

RPM_NAME = "texlive-storecmd-2023.201.0.0.0.2svn24431-57.1.noarch.rpm"
RPM_HASH = "33532ca8820dfc74957a823976effb52ea096a0ba7521d0b5646196d7138072f6492e9a6dd610958548ccc64eb20e2c4e5e3deccc3b3867285ff99ab05e73ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-storecmd.sty \
texlive-storecmd"

RDEPENDS:${PN} += "/bin/sh \
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
