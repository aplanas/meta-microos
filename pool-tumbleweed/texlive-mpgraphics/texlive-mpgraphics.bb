SUMMARY = "Process and display MetaPost figures inline"
DESCRIPTION = "The package allows LaTeX users to typeset MetaPost code inline \
and display figures in their documents with only and only one \
run of LaTeX, pdfLaTeX or XeLaTeX (no separate runs of mpost). \
Mpgraphics achieves this by using the shell escape (\\write 18) \
feature of current TeX distributions, so that the whole process \
is automatic and the end user is saved the tiresome processing."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn29776"

RPM_NAME = "texlive-mpgraphics-2023.201.0.0.3svn29776-54.1.noarch.rpm"
RPM_HASH = "67a7b8beb86e5e2c156218b633b895ebe6fec7db0aea6f9631e1a90bc5ac79898802bebb2351f47bd798166e8658b684b7edf8261eb45ec2a4d53c987d295d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpgraphics.sty \
texlive-mpgraphics"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.cfg \
tex-color.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-moreverb.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
