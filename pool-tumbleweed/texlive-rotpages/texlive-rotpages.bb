SUMMARY = "Typeset sets of pages upside-down and backwards"
DESCRIPTION = "The rotpages package allows you to format documents where small \
sets of pages are rotated by 180 degrees and rearranged, so \
that they can be read by turning the printed copy upside-down. \
It was developed for collecting exercises and solutions: using \
the package, you can print the exercise text normally and the \
solutions rotated."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn18740"

RPM_NAME = "texlive-rotpages-2023.201.3.0svn18740-53.1.noarch.rpm"
RPM_HASH = "b9b359db58a04a99dfd19d4b9107f79ea039bd7ddf31e538ce13b66ef127e52e143f0bcd37f60fa442cc8ec4a1adb51252775bcc976fb99ff6afa769be1606f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rotpages.sty \
texlive-rotpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphics.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
