SUMMARY = "Pad numbers with arbitrary characters"
DESCRIPTION = "This package provides some simple macros which will pad numbers \
(or, indeed, any expanded token) with your choice of character \
(defaulting to '0') to your choice of number of places \
(defaults to '2'). This works not only on arabic numerals, but \
on any expanded list of tokens passed to it. This makes it \
suitable for, among other things, counters of all kinds."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47621"

RPM_NAME = "texlive-padcount-2023.209.1.0svn47621-52.1.noarch.rpm"
RPM_HASH = "34b72d219e8c8f4669ad140b960fa40987589b54a609c08028234b3de4019fc7e0ecf7a1a0ed1d7978fb3daeeda4f2362ad186b606f7704095bf4619d4b29565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-padcount.sty \
texlive-padcount"

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
