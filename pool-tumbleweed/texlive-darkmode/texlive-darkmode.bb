SUMMARY = "General Dark Mode Support for LaTeX-Documents"
DESCRIPTION = "This package provides an API for template and package \
developers to create dynamic color schemes for light- and \
darkmodes. For those unaware: We refer to dark mode when a \
document has a dark background with a light font and to light \
mode if it has a dark font with a light background."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64271"

RPM_NAME = "texlive-darkmode-2023.209.1.0.1svn64271-55.1.noarch.rpm"
RPM_HASH = "a79f3a10aab6d45fc72ce42806819b699e41c1c77ee4945bcaba562d48aef8f76c3eccdbadd461591e7d8fefeaec364038ed3a479f010654e9f8b00f5e197c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-darkmode.sty \
texlive-darkmode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pagecolor.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
