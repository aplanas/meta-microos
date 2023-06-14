SUMMARY = "LaTeX support for wnri fonts"
DESCRIPTION = "LaTeX support for the wnri fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0bsvn22338"

RPM_NAME = "texlive-wnri-latex-2023.201.1.0bsvn22338-53.1.noarch.rpm"
RPM_HASH = "f638af91504f08c1608608d37b09f219cc0d12428aa159e2981cd7bdb19c6f6b5afb66e7bf8376188ed65cae01f747681fe1822985992f24243aa99e79f00881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1wnr.fd \
tex-ot1wnss.fd \
tex-ot1wntt.fd \
tex-wnri.def \
tex-wnri.sty \
texlive-wnri-latex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
