SUMMARY = "Define new floating environments"
DESCRIPTION = "The package offers the command \\DeclareFloatingEnvironment, \
which the user may use to define new floating environments \
which behave like the LaTeX standard foating environments \
figure and table."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1lsvn52906"

RPM_NAME = "texlive-newfloat-2023.201.1.1lsvn52906-54.1.noarch.rpm"
RPM_HASH = "1d246db6a10edcdc2b179480b9adc6f44217b89bef986b42f5a38b86695a305f62b67a5a997d0d6f66eb86fe9311b81b2eaa4b45fcc28802b86f23cbe8784ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newfloat.sty \
texlive-newfloat"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
