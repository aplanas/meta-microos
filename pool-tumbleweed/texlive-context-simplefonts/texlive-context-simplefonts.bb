SUMMARY = "Simplified font usage for ConTeXt"
DESCRIPTION = "The package defines a set of commands for loading and using \
fonts in ConTeXt."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-simplefonts-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "dd783dba88f24301140429792b99c0f0f1de09ccf6474030d2bcaae0f9217a8fc14ca26fc7b654f43ab620c7e2b1e1961e22b542a6db7958204906f0498b3e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simplefonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
