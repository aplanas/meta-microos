SUMMARY = "A collection of easy-to-use macros"
DESCRIPTION = "The collection comprises: easybib, support for customising \
bibliographies; easybmat, support for composing block matrices; \
easyeqn, support for various aspects of equations; easymat, \
support for composing matrices; easytable, support for writing \
tables; easyvector, a C-like syntax for writing vectors."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99svn19440"

RPM_NAME = "texlive-easy-2023.209.0.0.99svn19440-54.2.noarch.rpm"
RPM_HASH = "9f21f4723e6cc59a63227ed09b1c33b1ad1d190b8ab172a9e080ec405bfc72d2c089f4556039d6dba1dcaf05d4c716dcca61fb0be26604d9bca649f8073e24b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easy.sty \
tex-easybib.sty \
tex-easybmat.sty \
tex-easyeqn.sty \
tex-easymat.sty \
tex-easytable.sty \
tex-easyvector.sty \
texlive-easy"

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
