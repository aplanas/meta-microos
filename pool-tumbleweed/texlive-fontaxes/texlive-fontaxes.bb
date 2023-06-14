SUMMARY = "Additional font axes for LaTeX"
DESCRIPTION = "The package adds several new font axes on top of LaTeX's New \
Font Selection Scheme. In particular, it splits the shape axis \
into a primary and a secondary shape axis, and it adds three \
new axes to deal with the different figure versions offered by \
many professional fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn55920"

RPM_NAME = "texlive-fontaxes-2023.201.1.0esvn55920-52.1.noarch.rpm"
RPM_HASH = "a9ba40280ae046291e561dc5f4d5cf56dfd728559d4b6747eb92dd59980b0e8b9857bd2913a1c38db9a08f65b0b1722092ba45267e5e6ef97950150ddf5b0829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontaxes.sty \
texlive-fontaxes"

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
