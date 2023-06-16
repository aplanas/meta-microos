SUMMARY = "Define data for the pdfpc presentation viewer"
DESCRIPTION = "This packages allows to define additional meta data within the \
PDF file which can be interpreted by the PDF presenter console \
(pdfpc) program. pdfpc depends on kvoptions, xstring, iftex, \
and hyperxmp."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7.0svn63866"

RPM_NAME = "texlive-pdfpc-2023.201.0.0.7.0svn63866-51.1.noarch.rpm"
RPM_HASH = "523f63f935e8ad016985cc20d18b85bb0330582b5f58d53dd203a2948297dfaffb45ff24388180ebb5b33606623ebe3e4087961fe05da222a357de4d48c85406"
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
