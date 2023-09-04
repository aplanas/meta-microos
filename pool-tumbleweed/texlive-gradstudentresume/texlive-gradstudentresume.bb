SUMMARY = "A generic template for graduate student resumes"
DESCRIPTION = "The package offers a template for graduate students writing an \
academic CV. The goal is to create a flexible template that can \
be customized based on each specific individual's needs."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38832"

RPM_NAME = "texlive-gradstudentresume-2023.209.svn38832-54.2.noarch.rpm"
RPM_HASH = "a4d95b2c24e742a66cd9d2793618ef7167bd291376fc949a81d6c25b092c9e359dd27e4369e0ccd9f30ece13cd16c6c131ef16a8d224f54471622d2ab6f0ac50"
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
