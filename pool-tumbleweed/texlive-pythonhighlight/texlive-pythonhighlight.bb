SUMMARY = "Highlighting of Python code, based on the listings package"
DESCRIPTION = "Highlighting of Python code, based on the listings package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43191"

RPM_NAME = "texlive-pythonhighlight-2023.209.svn43191-54.1.noarch.rpm"
RPM_HASH = "9e19eeb4cfe378eb48de0c4a6930c85f5946d720c9fedef4ebdcf42a444e2fdac87fe2f042f407b162650c6f37fc6aa6280527b44f62d5d9f05895050ca5c54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythonhighlight.sty \
texlive-pythonhighlight"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
