SUMMARY = "A generic template for graduate student resumes"
DESCRIPTION = "The package offers a template for graduate students writing an \
academic CV. The goal is to create a flexible template that can \
be customized based on each specific individual's needs."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38832"

RPM_NAME = "texlive-gradstudentresume-2023.209.svn38832-54.1.noarch.rpm"
RPM_HASH = "65b5c4d937b82df7bdd84006cf0ab15707f2894ec8bdfc98430ae000fbe7c1bfed70e5615ea2345c40833530c6c8d938c64e407504d8ebceb28448099c4d91b3"
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
