SUMMARY = "Session and timing information in lecture notes"
DESCRIPTION = "This LaTeX2e package makes it possible to add timing marks to \
lecture notes in order to help managing the time available for \
presenting a given section of the document. It also provides \
tools to record and estimate the progress throughout the \
course."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn49750"

RPM_NAME = "texlive-sesstime-2023.209.1.12svn49750-54.1.noarch.rpm"
RPM_HASH = "e68c2bdc64d1b1c4b034864bdbfb3ee0eb4a479156a25ef3bb103b1720b809b4287f4bb42a6933f5d191e741febd0efcf58b497fcdbb8193a80d62d9dc97b913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sesstime.sty \
texlive-sesstime"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
