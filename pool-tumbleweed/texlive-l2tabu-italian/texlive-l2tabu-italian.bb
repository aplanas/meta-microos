SUMMARY = "Italian Translation of Obsolete packages and commands"
DESCRIPTION = "Italian translation of the l2tabu practical guide to LaTeX2e (a \
list of obsolete packages and commands)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn25218"

RPM_NAME = "texlive-l2tabu-italian-2023.209.2.3svn25218-56.1.noarch.rpm"
RPM_HASH = "657fbc367ceaf4d6b18f4687e87e572bcc2d1b8bb8f7d338db677b79edc266286911d2f7d3526421704eba8b00009e285fb613c43aeddb455d110d16df28bddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-italian"

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
