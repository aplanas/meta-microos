SUMMARY = "Repeat items in an index after a page or column break"
DESCRIPTION = "This Package repeats item of an index if a page or column break \
occurs within a list of subitems. This helps to find out to \
which main item a subitem belongs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn24305"

RPM_NAME = "texlive-repeatindex-2023.209.0.0.01svn24305-54.2.noarch.rpm"
RPM_HASH = "d7cf73ee5f7ab7656767eb0e25bc6fb93cd6ea71f000b84246c901161c27e3ba68b824606fb360e799a63a6582375d2753385c60c5693a128fcc3f1fd97e90b2"
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
