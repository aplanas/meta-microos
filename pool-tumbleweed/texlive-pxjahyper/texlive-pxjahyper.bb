SUMMARY = "Hyperref support for pLaTeX"
DESCRIPTION = "This package adjusts the behavior of hyperref on (u)pLaTeX so \
that authors can properly create PDF documents that contain \
document information in Japanese."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-2023.201.1.3svn66272-53.2.noarch.rpm"
RPM_HASH = "3586a3a8b22a3055f6f8ed68cf643c734d95c0a21ecd230caf9112b3857e9a42a9417edeb7186cd21558ef09a18945358c2a908cd2074548369dff6053d9eca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxjahyper-ajm.def \
tex-pxjahyper-enc.sty \
tex-pxjahyper-uni.def \
tex-pxjahyper.sty \
texlive-pxjahyper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-bxjatoucs.sty \
tex-etoolbox.sty \
tex-keyval.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
