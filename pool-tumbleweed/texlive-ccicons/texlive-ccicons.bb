SUMMARY = "LaTeX support for Creative Commons icons"
DESCRIPTION = "The package provides the means to typeset Creative Commons \
icons, in documents licensed under CC licences. A font (in \
Adobe Type 1 format) and LaTeX support macros are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54512"

RPM_NAME = "texlive-ccicons-2023.201.1.6svn54512-52.1.noarch.rpm"
RPM_HASH = "08c35978e3273b0382885d5e347eecf5fd12dcc4cfcbdb5ffc1df4a9b19920106e5c74e156f6bef4518954e4c93655157bd401f4634d98dfd0cb62990c0203d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccicons-u.enc \
tex-ccicons.map \
tex-ccicons.sty \
tex-ccicons.tfm \
texlive-ccicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-ccicons-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
