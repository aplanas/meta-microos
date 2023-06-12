SUMMARY = "Typeset gamebooks and other interactive novels"
DESCRIPTION = "This package provides the means in order to lay-out gamebooks \
with LaTeX. A simple gamebook example is included with the \
package, and acts as a tutorial."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24714"

RPM_NAME = "texlive-gamebook-2023.201.1.0svn24714-52.1.noarch.rpm"
RPM_HASH = "2faa00d78f7106e15c9a14e27eaf423db594626485af922465dd4fabe686f18e574b545a5bc6ce73b525e8a9640de3ca17bb714e23ec8dccabd6c7ce3b1aa6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gamebook.sty) \
texlive-gamebook"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(draftwatermark.sty) \
tex(enumitem.sty) \
tex(extramarks.sty) \
tex(fancyhdr.sty) \
tex(ifthen.sty) \
tex(prelim2e.sty) \
tex(scrtime.sty) \
tex(titlesec.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
