SUMMARY = "A PSTricks package to draw marble-like patterns"
DESCRIPTION = "This is a PSTricks package to draw marble-like patterns."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn50925"

RPM_NAME = "texlive-pst-marble-2023.201.1.6svn50925-52.1.noarch.rpm"
RPM_HASH = "d9033474b1949d77f1c2db79e9d9866d6d6c8c0cba3e63c127eef7d7121d008af1fb2cfb34dea6ce6a7f736862f3bd83192bee21a3ada8ba5971daabb1414ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-marble.sty \
tex-pst-marble.tex \
texlive-pst-marble"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
