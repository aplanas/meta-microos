SUMMARY = "Hyperref support for pLaTeX"
DESCRIPTION = "This package adjusts the behavior of hyperref on (u)pLaTeX so \
that authors can properly create PDF documents that contain \
document information in Japanese."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-2023.209.1.3svn66272-54.2.noarch.rpm"
RPM_HASH = "22137556440cdf143fe397f36b1de4dd68a7ec7d473715cf4a71506b9ab9567c1a1df92ba9cd57b1524311ddefe3a9026392ff888c9876895517a9ff9c36da19"
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
