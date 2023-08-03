SUMMARY = "Extend list of predefined colour names for MetaPost"
DESCRIPTION = "The MetaPost format plain.mp provides only five built-in colour \
names (variables), all of which are defined in the RGB model: \
red, green and blue for the primary colours and black and \
white. The package makes more than 500 colour names from \
different colour sets in different colour models available to \
MetaPost. Colour sets include X11, SVG, DVIPS and xcolor \
specifications."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.20svn23252"

RPM_NAME = "texlive-mpcolornames-2023.209.0.0.20svn23252-55.1.noarch.rpm"
RPM_HASH = "e5e337558e1dbf7271d093e34ab34712d85e05f7280f24b53a2f3ef226cbea35fa0b486d2d01727575889d03abb9b97c0b9bd0fcfeb90a336085bd41edaf9469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpcolornames"

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
