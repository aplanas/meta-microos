SUMMARY = "Style for Universidad Nacional Autonoma de Mexico theses"
DESCRIPTION = "The package provides a customisable format to typeset Theses \
according to the Universidad Nacional Autonoma de Mexico \
guidelines. Support for use in Scientific Workplace (SWP) 3.x \
is also provided. The bundle also includes an appropriate \
bibliographic style which enables the use of author-year \
schemes using the natbib package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn43639"

RPM_NAME = "texlive-unamthesis-2023.209.2.1svn43639-54.1.noarch.rpm"
RPM_HASH = "de2461652dcf89eae3a16fe7e1a84edeef3330b62e15495fab982371dbcc2560a0edd3aa47a2af3b0fbf1d173c392fba6e5cb589988314347da3f8695d5185ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UNAMThesis.sty \
texlive-unamthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
