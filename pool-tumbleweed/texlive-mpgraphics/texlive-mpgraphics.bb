SUMMARY = "Process and display MetaPost figures inline"
DESCRIPTION = "The package allows LaTeX users to typeset MetaPost code inline \
and display figures in their documents with only and only one \
run of LaTeX, pdfLaTeX or XeLaTeX (no separate runs of mpost). \
Mpgraphics achieves this by using the shell escape (\\write 18) \
feature of current TeX distributions, so that the whole process \
is automatic and the end user is saved the tiresome processing."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn29776"

RPM_NAME = "texlive-mpgraphics-2023.209.0.0.3svn29776-55.1.noarch.rpm"
RPM_HASH = "84c3941d44e4f3abf91346c2c995c5952cb7e72f8ca2ceda31c5a4ab3f4ba02384301332d85fe7b5c636f5242428c7608f6e5dad79ba6944ae9a518607115031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpgraphics.sty \
texlive-mpgraphics"

RDEPENDS:${PN} += "/usr/bin/sh \
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
