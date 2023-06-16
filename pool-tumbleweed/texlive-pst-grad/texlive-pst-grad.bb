SUMMARY = "Filling with colour gradients, using PSTricks"
DESCRIPTION = "The package fills with colour gradients, using PSTricks. The \
RGB, CMYK and HSB models are supported. Other colour gradient \
mechanisms are to be found in package pst-slpe."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn15878"

RPM_NAME = "texlive-pst-grad-2023.201.1.06svn15878-52.1.noarch.rpm"
RPM_HASH = "bec006ea0029ce7d5fd691b119b86430eda63f9dfde21d670e8699e6f99ecf8c2190cb06811139b3fb0b225e187d093b853744b66842993de5a244bc69203768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-grad.sty \
tex-pst-grad.tex \
texlive-pst-grad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
