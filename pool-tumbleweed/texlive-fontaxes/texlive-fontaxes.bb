SUMMARY = "Additional font axes for LaTeX"
DESCRIPTION = "The package adds several new font axes on top of LaTeX's New \
Font Selection Scheme. In particular, it splits the shape axis \
into a primary and a secondary shape axis, and it adds three \
new axes to deal with the different figure versions offered by \
many professional fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn55920"

RPM_NAME = "texlive-fontaxes-2023.209.1.0esvn55920-53.1.noarch.rpm"
RPM_HASH = "893266fd9a6a9d1eee1a179ad43a7537bf5e7489bff42c9613dd98f1b0f9b278eda04d18c39f533d5cca4925f1bca2d60f718cbda7a98284e1df0c2c24d85eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontaxes.sty \
texlive-fontaxes"

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
