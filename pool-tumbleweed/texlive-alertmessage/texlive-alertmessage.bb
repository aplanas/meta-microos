SUMMARY = "Alert messages for LaTeX"
DESCRIPTION = "Some macros to display alert messages (informations, errors, \
warnings and success messages)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38055"

RPM_NAME = "texlive-alertmessage-2023.209.1.1svn38055-55.1.noarch.rpm"
RPM_HASH = "91c083930824aa7df101d4914dbdcd29e2a3f0c9ed7f54efd3f19e3a799ff80a00d8c91619af57ff0454242ecee2f73fcb866d5bbc040ab4b0e84048ecd63d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alertmessage.sty \
texlive-alertmessage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-picture.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
