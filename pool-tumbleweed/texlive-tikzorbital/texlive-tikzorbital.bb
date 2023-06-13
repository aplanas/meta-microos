SUMMARY = "Atomic and molecular orbitals using TikZ"
DESCRIPTION = "Atomic s, p and d orbitals may be drawn, as well as molecular \
orbital diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36439"

RPM_NAME = "texlive-tikzorbital-2023.201.svn36439-52.1.noarch.rpm"
RPM_HASH = "340e21a61d9a4da874ea19d947e9f59d9c79edf6c58039ec9a66f3f2ce32b5ed1fd05c9b371827fda990320adbbbad9f0846f40fb32c2427dfb6e41cb6cfeb51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzorbital.sty) \
texlive-tikzorbital"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
