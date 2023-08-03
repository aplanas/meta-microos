SUMMARY = "Unicode compatible index generation"
DESCRIPTION = "This package provides a unicode compatible index programm for \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.47svn65597"

RPM_NAME = "texlive-xindex-2023.209.0.0.47svn65597-53.1.noarch.rpm"
RPM_HASH = "a420d0acc81b624ffcfb6818013dd1b37d9da1303dd77230d6ae1fd2ffd7dba2cef3e707e19a243ca0aa3624598e6a19526a4404b218b88fe3590c285d99936a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xindex.sty \
texlive-xindex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
