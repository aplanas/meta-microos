SUMMARY = "Adjust locations and kerning of CJK punctuation marks"
DESCRIPTION = "The package serves as a companion package for CJK."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.8.4svn41119"

RPM_NAME = "texlive-cjkpunct-2023.209.4.8.4svn41119-54.1.noarch.rpm"
RPM_HASH = "a674358cb911203c736f6cf65cb10f4b91331da201671021c2b588239efa2edc857ae700c5ab8a0bda3032ddc7305d782fdee755268e19e07ddfec23bc926d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CJKpunct.sty \
texlive-cjkpunct"

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
