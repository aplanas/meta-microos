SUMMARY = "Support for color in XeLaTeX"
DESCRIPTION = "This is a simple package which defines about 140 different \
colours using XeTeX's colour feature. The colours can be used \
in bidirectional texts without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-2023.209.0.0.1svn29660-53.2.noarch.rpm"
RPM_HASH = "8cbf5502046519877b877267aeef710b34cdc33e622eab86d1f563884494e40b131d90f515e35ec9c916cb37876aaa3843768ee045d51ce92f112dd1bfc457b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecolor.sty \
texlive-xecolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
