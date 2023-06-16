SUMMARY = "A LaTeX-based replacement for BibTeX"
DESCRIPTION = "Amsrefs is a LaTeX package for bibliographies that provides an \
archival data format similar to the format of BibTeX database \
files, but adapted to make direct processing by LaTeX easier. \
The package can be used either in conjunction with BibTeX or as \
a replacement for BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn61937"

RPM_NAME = "texlive-amsrefs-2023.201.2.14svn61937-54.1.noarch.rpm"
RPM_HASH = "a2fb8c9f7c0617a181a8454faa4ba1dec04457591608fab2f3ebeb2e19a947d38e1197b29a2fcd57b1ebc7b7bab0331da3c443e4ca924d3d55963ee099f77d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsbst.sty \
tex-amsrefs.sty \
tex-ifoption.sty \
tex-mathscinet.sty \
tex-pcatcode.sty \
tex-rkeyval.sty \
tex-textcmds.sty \
texlive-amsrefs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-backref.sty \
tex-hyperref.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
