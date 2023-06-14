SUMMARY = "Adjust locations and kerning of CJK punctuation marks"
DESCRIPTION = "The package serves as a companion package for CJK."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.8.4svn41119"

RPM_NAME = "texlive-cjkpunct-2023.201.4.8.4svn41119-53.1.noarch.rpm"
RPM_HASH = "8659d33b26d12d5b78805e115669d2418aa76af8e945e00305f683fea48568b2a00f1b22a6642790e6f47fba78b5cd35d802b05037e245911fd67918437ab7c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CJKpunct.sty \
texlive-cjkpunct"

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
