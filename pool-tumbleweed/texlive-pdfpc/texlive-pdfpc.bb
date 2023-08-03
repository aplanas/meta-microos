SUMMARY = "Define data for the pdfpc presentation viewer"
DESCRIPTION = "This packages allows to define additional meta data within the \
PDF file which can be interpreted by the PDF presenter console \
(pdfpc) program. pdfpc depends on kvoptions, xstring, iftex, \
and hyperxmp."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7.0svn63866"

RPM_NAME = "texlive-pdfpc-2023.209.0.0.7.0svn63866-52.1.noarch.rpm"
RPM_HASH = "0f949e70a559751578aa2de5141fd08e59393e3a0ef05d4f856491173fc9680d4ff64087f5c36a3e5fbbe9c015d17260c510094ea46c208a41a97b80f4936433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpc.sty \
texlive-pdfpc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperxmp.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
