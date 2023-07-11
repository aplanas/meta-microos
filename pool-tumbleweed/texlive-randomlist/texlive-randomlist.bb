SUMMARY = "Deal with database, loop, and random in order to build personalized exercises"
DESCRIPTION = "The main aim of this package is to work on lists, especially \
with random operations. The hidden aim is to build a personnal \
collection of exercises with different data for each pupil."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn45281"

RPM_NAME = "texlive-randomlist-2023.201.1.3svn45281-53.2.noarch.rpm"
RPM_HASH = "b13695de21f372aa5e91c947396a97ee89d11849d6546ba579328c1794486209fd99608d0357bd7ae797cc68c7557c2be4976c622596ba18ddd1876c47fcefca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randomlist.sty \
tex-randomlist.tex \
texlive-randomlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
