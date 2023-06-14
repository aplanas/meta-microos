SUMMARY = "Dodecaphonic diagrams: twelve-tone matrices, clock diagrams, etcetera"
DESCRIPTION = "This is a music-related package which is focused on notation \
from the Twelve-Tone System, also called Dodecaphonism. It \
provides LaTeX algorithms that produce typical dodecaphonic \
notation based off a musical series, or row sequence, of \
variable length. The package requires etoolbox, pgfkeys, TikZ, \
xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn52009"

RPM_NAME = "texlive-ddphonism-2023.201.0.0.2svn52009-52.1.noarch.rpm"
RPM_HASH = "1effb42e328822b26b82c531ab69a0a4f55bd53b9df3110d2295d4451708ae85fbd40d381a32035cbbbe4ebe4213d103406925bc9eab0f9ccf1acc9ac2753635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ddphonism.sty \
texlive-ddphonism"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
