SUMMARY = "Tools for customising appendices"
DESCRIPTION = "The package provides an \\AtAppendix command to add code to a \
hook that is executed when \\appendix is called by the user. \
Additionally, a TeX conditional \\ifappendix and a LaTeX-style \
conditional \\IfAppendix are provided to check if \\appendix has \
already been called."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn28400"

RPM_NAME = "texlive-apptools-2023.201.1.0svn28400-54.1.noarch.rpm"
RPM_HASH = "0bec00ce718b31434674b8db735e64d20c5f0ea97ac27785c17844fc0d87063d25f59448834a8f7f404278f10805f95d9a58a44ba7764b8233bfa9c784c5c6e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(apptools.sty) \
texlive-apptools"
RDEPENDS:${PN} += "/bin/sh \
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
