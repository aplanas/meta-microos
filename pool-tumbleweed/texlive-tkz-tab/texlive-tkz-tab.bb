SUMMARY = "Tables of signs and variations using PGF/TikZ"
DESCRIPTION = "The package provides comprehensive facilities for preparing \
lists of signs and variations, using PGF. The package \
documentation requires the tkz-doc bundle. This package has \
been taken temporarily out of circulation to give the author \
time to investigate some problems."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12csvn66115"

RPM_NAME = "texlive-tkz-tab-2023.209.2.12csvn66115-53.1.noarch.rpm"
RPM_HASH = "b8e03b1df15b877824d5aee1cca6004ad3d53169a630d30c2a7498d08d036c4b1ef422aaa048cba11186beba3e6e8aa1aff9ba4ad90c303916c25f9b18c9351b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-tab.sty \
texlive-tkz-tab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
