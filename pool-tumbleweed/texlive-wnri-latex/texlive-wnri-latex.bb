SUMMARY = "LaTeX support for wnri fonts"
DESCRIPTION = "LaTeX support for the wnri fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0bsvn22338"

RPM_NAME = "texlive-wnri-latex-2023.209.1.0bsvn22338-54.1.noarch.rpm"
RPM_HASH = "50d2dff676dc14708dd34e9ee5df4eb6d501da10a93c0285eb2132541e3389f4fa67aa463f51f5789832f18a611b0640c3678b894f4d6d8166b2eb00e0a3b8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1wnr.fd \
tex-ot1wnss.fd \
tex-ot1wntt.fd \
tex-wnri.def \
tex-wnri.sty \
texlive-wnri-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
