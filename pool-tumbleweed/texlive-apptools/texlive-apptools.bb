SUMMARY = "Tools for customising appendices"
DESCRIPTION = "The package provides an \\AtAppendix command to add code to a \
hook that is executed when \\appendix is called by the user. \
Additionally, a TeX conditional \\ifappendix and a LaTeX-style \
conditional \\IfAppendix are provided to check if \\appendix has \
already been called."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn28400"

RPM_NAME = "texlive-apptools-2023.209.1.0svn28400-55.1.noarch.rpm"
RPM_HASH = "de4ffeed713daf1ea24303f2305ab9d85cb6d67748b37eabbc2bc6383c6c4057a4eb9a9db91e1c6782d78dceac9c40724febf8d98333e90e5972abb6dcfa89e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apptools.sty \
texlive-apptools"

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
