SUMMARY = "Underlined running heads"
DESCRIPTION = "Defines two pagestyles that provide underlined page heads in \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-underlin-2023.209.1.01svn15878-54.1.noarch.rpm"
RPM_HASH = "21d2c5fbf4e70a5654dc10a254c3c5c20dfc8a808e5c2c7dd44b853c036f6a14f1215349b6b8a9e9b986353364e7c375bf0011237ef3b5de223eedf3984363ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-underlin.sty \
texlive-underlin"

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
