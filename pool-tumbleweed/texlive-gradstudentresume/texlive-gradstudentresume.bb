SUMMARY = "A generic template for graduate student resumes"
DESCRIPTION = "The package offers a template for graduate students writing an \
academic CV. The goal is to create a flexible template that can \
be customized based on each specific individual's needs."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38832"

RPM_NAME = "texlive-gradstudentresume-2023.201.svn38832-53.1.noarch.rpm"
RPM_HASH = "be9836fa464328a38fc9eb2a116a93ac34571fd9dae44efa755ee3ce8e8532d599f36ac7c6752acd5b831ff9e3c5f72486f122b2b44a8b71122002826dc5d379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gradstudentresume.cls) \
texlive-gradstudentresume"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(anysize.sty) \
tex(hyperref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
