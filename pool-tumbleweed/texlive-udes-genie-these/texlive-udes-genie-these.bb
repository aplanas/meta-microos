SUMMARY = "A thesis class file for the Faculte de genie at the Universite de Sherbrooke"
DESCRIPTION = "The udes-genie-these class can be used for Ph.D. theses, \
master's theses and project definitions at the Faculte de genie \
of the Universite de Sherbrooke (Quebec, Canada). The class \
file is coherent with the latest version of the Protocole de \
redaction aux etudes superieures which is available on the \
faculte's intranet. The class file documentation is in French, \
the language of the typical user at the Universite de \
Sherbrooke. An example of use is also distributed with the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn65039"

RPM_NAME = "texlive-udes-genie-these-2023.209.3.0.1svn65039-54.1.noarch.rpm"
RPM_HASH = "c733dc344cbcdd40d754965b5f897301000cca51bfa8a1d2ae0753adf87ac15d0f16369314dcc449bc9c358d44e6f4eaa71acb368ad966484a64da353e85b223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-udes-genie-these.cls \
texlive-udes-genie-these"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-book.cls \
tex-caption.sty \
tex-fancyhdr.sty \
tex-flafter.sty \
tex-geometry.sty \
tex-l3keys2e.sty \
tex-parskip.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
