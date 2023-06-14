SUMMARY = "Unicode compatible index generation"
DESCRIPTION = "This package provides a unicode compatible index programm for \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.47svn65597"

RPM_NAME = "texlive-xindex-2023.201.0.0.47svn65597-52.1.noarch.rpm"
RPM_HASH = "6986927d27347bbc63f2bf1bf78413270ceeb7390784bd2f21263f595d49126faf70d5001104997a394abd882ca2e34efbc19f84cc38a4996c78130ab921d71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xindex.sty \
texlive-xindex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
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
