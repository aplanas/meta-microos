SUMMARY = "Automatically compute headlength for fancyhdr package"
DESCRIPTION = "The package automatically computes headlength for the fancyhdr \
package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn54049"

RPM_NAME = "texlive-autofancyhdr-2023.209.0.0.1svn54049-54.1.noarch.rpm"
RPM_HASH = "0d1fef22f08cc111e0d359fab333e4b372e6e13cc6fb93319079a155ed9a89be1927e4f1390c28dec8593221210e4eeec59ffeac3c89c58f08eca10bc223a6af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autofancyhdr.sty \
texlive-autofancyhdr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-fancyhdr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
