SUMMARY = "A LaTeX-based replacement for BibTeX"
DESCRIPTION = "Amsrefs is a LaTeX package for bibliographies that provides an \
archival data format similar to the format of BibTeX database \
files, but adapted to make direct processing by LaTeX easier. \
The package can be used either in conjunction with BibTeX or as \
a replacement for BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn61937"

RPM_NAME = "texlive-amsrefs-2023.209.2.14svn61937-55.1.noarch.rpm"
RPM_HASH = "31ab1406c52d830690fa16e7f28260fb301bb93ffde3b405618141ef729090dd6f4e98a8554bc89a3fd0ac740c72c9eeab543abfcdcac694ec7f44f676455652"
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
