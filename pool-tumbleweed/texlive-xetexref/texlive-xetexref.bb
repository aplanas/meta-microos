SUMMARY = "Reference documentation of XeTeX"
DESCRIPTION = "The package comprises reference documentation for XeTeX \
detailing its extended features."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65987"

RPM_NAME = "texlive-xetexref-2023.201.svn65987-52.1.noarch.rpm"
RPM_HASH = "db49dc242138b763a694b0f20d628ce8bc24698e0917a7cc505dd805bd765db23a83828a7f2e0935f1bfea0b5ccb6d9f6474deaf9b9ba9ab5bccc850094ed0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexref"
RDEPENDS:${PN} += "/bin/sh \
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
