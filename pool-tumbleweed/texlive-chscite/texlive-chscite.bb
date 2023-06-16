SUMMARY = "Bibliography style for Chalmers University of Technology"
DESCRIPTION = "The package, heavily based on the harvard package for \
Harvard-style citations, provides a citation suite for students \
at Chalmers University of Technology that follows given \
recommendations."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9999svn28552"

RPM_NAME = "texlive-chscite-2023.201.2.9999svn28552-53.1.noarch.rpm"
RPM_HASH = "9f2c4e6f4055a7f3e6bdb9a6421b375f0d8fa7dc5d63f024f8e2b73c6ce9320ff48c83c88320f6e259eefcd485484277069bee856067b7937578ab8dc151b1e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chscite.sty \
texlive-chscite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
