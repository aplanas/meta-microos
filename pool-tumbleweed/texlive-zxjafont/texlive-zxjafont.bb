SUMMARY = "Set up Japanese font families for XeLaTeX"
DESCRIPTION = "The zxjafont package"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62864"

RPM_NAME = "texlive-zxjafont-2023.209.1.3svn62864-53.1.noarch.rpm"
RPM_HASH = "0732c55611f986f7f4cb1e5f2e6011fdaba382335886e377327b6c39abb17a811c01cb41f0bf5d66bb695f07163c5ad50931664ecb8e1e224bc649c9b0dcce14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafont.sty \
texlive-zxjafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
