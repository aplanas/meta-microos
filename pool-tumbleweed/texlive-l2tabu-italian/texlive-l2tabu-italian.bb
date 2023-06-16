SUMMARY = "Italian Translation of Obsolete packages and commands"
DESCRIPTION = "Italian translation of the l2tabu practical guide to LaTeX2e (a \
list of obsolete packages and commands)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn25218"

RPM_NAME = "texlive-l2tabu-italian-2023.201.2.3svn25218-55.1.noarch.rpm"
RPM_HASH = "307d2a4889de1697e06b787996f968d71759290d611e688e8402e8500f42b62e5a1a8bbcd6ed8b09fde65f01f09b9d78bcd87f4694c58cc116865c15cd355de9"
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
