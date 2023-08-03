SUMMARY = "Standard pages with n lines of at most m characters each"
DESCRIPTION = "For translations, proofreading, journal contributions etc. \
standard pages are used. Those standard pages consist of a \
fixed number of lines and characters per line. This package \
produces pages with n lines of at most m characters each. For \
instance the German 'Normseite': 60 lines of 30 characters \
each."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-stdpage-2023.209.0.0.6svn15878-58.1.noarch.rpm"
RPM_HASH = "b6c28c5f542054a9b5f78819fca278e2ce92ca5f6c56d5f6ba2f8179a186fbd1cf4fbc7b7819557297dc3333f376d0748f18b79a9dc5ed397da9608b69f78134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stdpage.sty \
texlive-stdpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyphenat.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
