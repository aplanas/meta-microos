SUMMARY = "Label any kind of term with a continuous counter"
DESCRIPTION = "The termlist package provides environments to indent and label \
any kind of terms with a continuous number. Candidate terms may \
appear inside an equation or eqnarray environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn18923"

RPM_NAME = "texlive-termlist-2023.201.1.1svn18923-54.1.noarch.rpm"
RPM_HASH = "d89ad5d2da9d604fe789962ee47cdb1d097a0bb039b883610d68ded6f53a239d5772d1a485c7804be5844ed118385caa947cac4449172a6bc12f5ed2af58dc59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termlist.sty \
texlive-termlist"

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
