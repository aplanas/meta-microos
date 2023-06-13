SUMMARY = "Support for writing about xiangqi"
DESCRIPTION = "The package is for writing about xiangqi or chinese chess. You \
can write games or parts of games and show diagrams with \
special positions."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn35211"

RPM_NAME = "texlive-xq-2023.201.0.0.4svn35211-52.1.noarch.rpm"
RPM_HASH = "26323ba4ba45129d58708019a361416e380be62796fd42ae3dfb154843c793de855d2c7cb786804f5e6048979c10aa66d741e163f767df1f1813a1c3ccec969d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xq.sty) \
tex(xqlarge.tfm) \
tex(xqnormal.tfm) \
texlive-xq"

RDEPENDS:${PN} += "/bin/sh \
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
