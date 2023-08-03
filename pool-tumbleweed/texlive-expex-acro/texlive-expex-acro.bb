SUMMARY = "Wrapper for the expex package"
DESCRIPTION = "This is a small wrapper for the expex package, adding ways to \
define, use, and summarize glossing abbreviations. It also \
provides commands to refer to examples, as well as some inline \
formatting commands commonly used in linguistics."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn63319"

RPM_NAME = "texlive-expex-acro-2023.209.0.0.0.2svn63319-53.1.noarch.rpm"
RPM_HASH = "f045ee55596edd2727d74c208bde5c9171bc7840328292946bba00077a9cecaaf90f60fefbbba0a4a35ac5390000b9e09183d6563b3c820b373bdb10b29c0231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expex-acro.sty \
texlive-expex-acro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acro.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expex.sty \
tex-l3keys2e.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
