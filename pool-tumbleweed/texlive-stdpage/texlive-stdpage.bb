SUMMARY = "Standard pages with n lines of at most m characters each"
DESCRIPTION = "For translations, proofreading, journal contributions etc. \
standard pages are used. Those standard pages consist of a \
fixed number of lines and characters per line. This package \
produces pages with n lines of at most m characters each. For \
instance the German 'Normseite': 60 lines of 30 characters \
each."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-stdpage-2023.201.0.0.6svn15878-57.1.noarch.rpm"
RPM_HASH = "115c833c869d2051e3db19dd5443449837348093b3298aa447c42c2327a6ff8aa29abc8fab5b905c3c9f217b1064255bb991662fddf55b7c63bd06f15f65f883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(stdpage.sty) \
texlive-stdpage"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyphenat.sty) \
tex(titlesec.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
