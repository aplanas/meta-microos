SUMMARY = "Statistics style"
DESCRIPTION = "A package defining many macros for items of significance in \
statistical presentations. An updated, but incompatible, \
version of the package is available: statex2."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn20306"

RPM_NAME = "texlive-statex-2023.209.1.6svn20306-58.1.noarch.rpm"
RPM_HASH = "60599984ed36dbd0e82702a3a2ae903145a33b36a243f05e314dd7ca75a784a821da7b86b807d201d3dbe58a8cbbaec2596d0c8e57c5e9b47c5023c6b6b836ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statex.sty \
texlive-statex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-color.sty \
tex-ifthen.sty \
tex-shortvrb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
