SUMMARY = "Tabular-like environments with named columns"
DESCRIPTION = "This package implements a variant of tabular-like environments \
where columns can be given a name and entries can flexibly be \
placed between arbitrary columns. Complex alignment-based \
layouts, for example for program code, are possible. The \
package depends on lazylist."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.6svn55837"

RPM_NAME = "texlive-polytable-2023.201.0.0.8.6svn55837-52.1.noarch.rpm"
RPM_HASH = "18ff4aa6a7c08eafa1a28d85ab8d819b338de9c01b985b1dad33c2ffed3e98f151701b3ea9be836c7b4028b48d90069e41cf500222881bcae82832875fe698bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polytable.sty \
texlive-polytable"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-lazylist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
