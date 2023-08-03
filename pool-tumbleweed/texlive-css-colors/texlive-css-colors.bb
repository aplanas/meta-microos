SUMMARY = "Named colors for web-safe design"
DESCRIPTION = "This package defines web-safe colors for use with D.P. \
Carlisle's color package. It is intended for both authors and \
package writers (e.g. to create Beamer color themes)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn54512"

RPM_NAME = "texlive-css-colors-2023.209.1.02svn54512-55.1.noarch.rpm"
RPM_HASH = "a1b1735a0c0287cbdee0bb7f9d164bfd7a86ca1459b07087d27e314077977ab80a7ca57577c55e517f377f69ae9974a02922b46212b81ff00b96737f2885b99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-css-colors.sty \
texlive-css-colors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
