SUMMARY = "Typesetting financial tables"
DESCRIPTION = "In financial reports, text and currency amounts are regularly \
put in one table, e.g., a year balance or a profit-and-loss \
overview. This package provides the settings for automatically \
typesetting such columns, including the sum line (preceded by a \
rule of the correct width) using the specifier 'f'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.1svn61855"

RPM_NAME = "texlive-fcolumn-2023.209.1.4.1svn61855-53.1.noarch.rpm"
RPM_HASH = "a2f72940ca2a1408139a64a17c4acede02a738078269a1d4d249df4c0df2ae738d0bf13e1333e655d2d9968db7dda705d2130efd0fd633acb18224e246cf868e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fcolumn.sty \
texlive-fcolumn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
