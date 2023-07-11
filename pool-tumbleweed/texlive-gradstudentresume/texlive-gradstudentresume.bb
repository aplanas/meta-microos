SUMMARY = "A generic template for graduate student resumes"
DESCRIPTION = "The package offers a template for graduate students writing an \
academic CV. The goal is to create a flexible template that can \
be customized based on each specific individual's needs."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38832"

RPM_NAME = "texlive-gradstudentresume-2023.201.svn38832-53.2.noarch.rpm"
RPM_HASH = "2b735d71113b9a14a554c166b516956c0b52a16db5c6bc2c66b7564064f89ebcf51928e3fa865672d1c65e185e8491af874f472441f8714a8fd46ccf6c0c4784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradstudentresume.cls \
texlive-gradstudentresume"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anysize.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
