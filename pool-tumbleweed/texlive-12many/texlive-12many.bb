SUMMARY = "Generalising mathematical index sets"
DESCRIPTION = "In the discrete branches of mathematics and the computer \
sciences, it will only take some seconds before you're faced \
with a set like {1,...,m}. Some people write $1\\ldotp\\ldotp m$, \
others $\\{j:1\\leq j\\leq m\\}$, and the journal you're submitting \
to might want something else entirely. The 12many package \
provides an interface that makes changing from one to another a \
one-line change."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-12many-2023.201.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "14257063d3c74f309312f45f0503932a0d9b1fd436437b7f1eb3bb8f0dcda0124aa770bca955c21c7baa6e8f3299430adb62eb596a478211cd6ac4a4e495ecd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-12many.sty \
texlive-12many"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
