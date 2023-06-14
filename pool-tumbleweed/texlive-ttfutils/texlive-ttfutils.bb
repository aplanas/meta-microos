SUMMARY = "Convert TrueType to TFM and PK fonts"
DESCRIPTION = "Utilities: ttf2afm ttf2pk ttf2tfm ttfdump. FreeType is the \
underlying library."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-ttfutils-2023.201.svn66186-52.1.noarch.rpm"
RPM_HASH = "14ecc9d19f8696d326ff089b361328c560968fc19e947a3e25a924b3ea7b252cb92c0f88bd33b2adb3897f2b0c485d3b5aef284dbe80e317813b90fca7b0a86c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-T1-WGL4.enc \
tex-ttf2pk.cfg \
texlive-ttfutils"

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
texlive-scripts-bin \
texlive-ttfutils-bin"

inherit rpm
