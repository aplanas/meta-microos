SUMMARY = "Create lists of random numbers"
DESCRIPTION = "This package can create lists of random numbers for any given \
interval [a;b]. It is possible to get lists with or without \
multiple numbers. The random generator will be initialized by \
the system time. The package can only be used with LuaLaTeX!"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.01svn49419"

RPM_NAME = "texlive-luarandom-2023.208.0.0.01svn49419-53.1.noarch.rpm"
RPM_HASH = "14057460bc7d56b6b17bfdc5d7d22dd3f67c681b434abdb387a43dbdd4df84a6359dfb2801c2eb3883f45afe44c39381f66cfe0eba5140f96aac0d426e02e471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luarandom.sty \
texlive-luarandom"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
