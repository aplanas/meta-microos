SUMMARY = "Typesetting financial tables"
DESCRIPTION = "In financial reports, text and currency amounts are regularly \
put in one table, e.g., a year balance or a profit-and-loss \
overview. This package provides the settings for automatically \
typesetting such columns, including the sum line (preceded by a \
rule of the correct width) using the specifier 'f'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.1svn61855"

RPM_NAME = "texlive-fcolumn-2023.201.1.4.1svn61855-52.1.noarch.rpm"
RPM_HASH = "60dff175c17c5d382fab0562c2cb6c44d599579c2bbf6edc9a90430eac5f78a4634299442532bf11561a9b84a40385462c4328a1c2df11e326e324880b186abb"
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
