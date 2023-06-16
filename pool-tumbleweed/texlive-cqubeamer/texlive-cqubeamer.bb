SUMMARY = "LaTeX Beamer Template for Chongqing University"
DESCRIPTION = "This package provides a LaTeX beamer template designed for \
researchers of Chongqing University. It can be used for \
academic reports, conferences, or thesis defense, and can be \
helpful for delivering a speech. It should be used with the \
XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn54512"

RPM_NAME = "texlive-cqubeamer-2023.204.1.0svn54512-54.1.noarch.rpm"
RPM_HASH = "53dc32e633ebdc3caf17152cfbfc3633d48c6d6e746191f3286992e80f00176ef24757abefa6ff4fa9f12eb9f1f7289c6478f506c853ba81584883c4ce9ef790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cqubeamer.sty \
texlive-cqubeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
