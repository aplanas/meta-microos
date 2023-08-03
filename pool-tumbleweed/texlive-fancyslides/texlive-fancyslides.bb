SUMMARY = "Custom presentation class built upon LaTeX Beamer"
DESCRIPTION = "This class is prepared for short presentations with a modern \
look & feel. It offers the following features: custom \
background for each slide, predefined types of slides, \
simplified commands (e.g. for starting and ending slide). The \
class is built upon LaTeX beamer, so all beamer commands should \
work."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36263"

RPM_NAME = "texlive-fancyslides-2023.209.1.0svn36263-53.1.noarch.rpm"
RPM_HASH = "08c86203e1db12ec3786dd6af67c2b51d168db0890a3e90e9b825134319caa34df650fb7cd54031d1a2f80a1b218cad72ed435f6aa2a909cecd9ba83b6e3e428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyslides.cls \
texlive-fancyslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-framed.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
