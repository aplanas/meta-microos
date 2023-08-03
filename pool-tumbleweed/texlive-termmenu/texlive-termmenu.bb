SUMMARY = "The package provides support for terminal-based menus using expl3"
DESCRIPTION = "When writing programs, it's often required to present the user \
with a list of options/actions. The user is then expected to \
select one of these options for the program to process. \
termmenu provides this mechanism for TeX. It requires only \
expl3 support, thus the l3kernel and l3packages are both \
required."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37700"

RPM_NAME = "texlive-termmenu-2023.209.svn37700-55.1.noarch.rpm"
RPM_HASH = "88e6b1d7be1127c55d3e2734467227d90ea9c0c2c4905b397d27d338be0773171e9fa3b6602e34467b10c6f4b9ecc3884c756220c772fe1a3a359231d68e169d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termmenu.tex \
texlive-termmenu"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
