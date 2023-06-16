SUMMARY = "Balance last page in two-column mode"
DESCRIPTION = "This package balances the columns on the last page of a \
two-column document. If the page is 'simple' (no footnotes, \
floats, or marginpars), is uses the balance package; otherwise, \
it uses \\enlargethispage to make the left column shorter, \
balancing the columns."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn64002"

RPM_NAME = "texlive-pbalance-2023.201.1.4.0svn64002-51.1.noarch.rpm"
RPM_HASH = "d7a231b4a1fddeb24d0cd851bdfb75026b81bace0776f61a3bbed9417e4afc9d03dec6605ea98df4be5442ef7072718a625c157d173166ffb52431f9b27ab750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbalance.sty \
texlive-pbalance"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-atveryend.sty \
tex-balance.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filehook.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
