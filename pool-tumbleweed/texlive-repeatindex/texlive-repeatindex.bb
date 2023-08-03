SUMMARY = "Repeat items in an index after a page or column break"
DESCRIPTION = "This Package repeats item of an index if a page or column break \
occurs within a list of subitems. This helps to find out to \
which main item a subitem belongs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-2023.209.0.0.01svn24305-54.1.noarch.rpm"
RPM_HASH = "6fe612f36643ce6641df7c46b38b143c9a57b0776f505c75910da2dbd52df7153f1a7c4452c6431dc4d83ac615ab0426bca47f4261f200e125cf3fcc2dc00de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-repeatindex.sty \
texlive-repeatindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
