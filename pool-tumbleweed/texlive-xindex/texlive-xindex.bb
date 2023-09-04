SUMMARY = "Unicode compatible index generation"
DESCRIPTION = "This package provides a unicode compatible index programm for \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.47svn65597"

RPM_NAME = "texlive-xindex-2023.209.0.0.47svn65597-53.2.noarch.rpm"
RPM_HASH = "db893017051aa561742d492c1cf556849e947a9f63dc341ae047cab2b48841a9802f0a331fd39961047a0404cbc765731ee534f474593f1c35379953c5966b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xindex.sty \
texlive-xindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-imakeidx.sty \
tex-makeidx.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xindex-bin"

inherit rpm
