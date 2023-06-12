SUMMARY = "A macro to format section numbering intuitively"
DESCRIPTION = "This package provides a macro \\setsecnum to format section \
numbering intuitively. \\setsecnum{1.1.1} will set the section \
numbering format to arabic.arabic.arabic and the depth to 3. \
The package uses LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61813"

RPM_NAME = "texlive-secnum-2023.201.svn61813-53.1.noarch.rpm"
RPM_HASH = "af43c1b90494dd24263d0e1943bfa9826bc1aa6f28430d38b5b7e1064900ca51e0a2e47102bd9baf2d7006e29ecd28c657e6da693dccd90de4cb74c17cdd666a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(secnum.sty) \
texlive-secnum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
