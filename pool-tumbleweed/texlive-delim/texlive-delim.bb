SUMMARY = "Simplify typesetting mathematical delimiters"
DESCRIPTION = "The package permits simpler control of delimiters without \
excessive use of \\big... commands (and the like)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn23974"

RPM_NAME = "texlive-delim-2023.209.1.0svn23974-53.1.noarch.rpm"
RPM_HASH = "c8393844963c3c4419b8f83a44c5815a9c2a153874170b128fd482e305736eebd7209fb34672b2d3b139090ce85591e36cac1ad34a6aa8d8d640a2f0c93d856e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delim.sty \
texlive-delim"

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
