SUMMARY = "A simple beamer theme"
DESCRIPTION = "The package provides a simple theme, similar to some others, \
but designed to be attractive."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn39100"

RPM_NAME = "texlive-beamertheme-phnompenh-2023.209.1.0svn39100-54.1.noarch.rpm"
RPM_HASH = "7478845a0d5af28ce5b2bc8738cf8b23d0004a6e765f4eea814167e39dbf099d8918b31123f9d3a4f2274c28f03884fbcb3ede1fd0a199bc158d1b154e94de3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemePhnomPenh.sty \
texlive-beamertheme-phnompenh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
