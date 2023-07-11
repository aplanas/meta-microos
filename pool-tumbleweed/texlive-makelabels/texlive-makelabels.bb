SUMMARY = "Add a '\\makelabels' feature to KOMA-Script letter classes and package"
DESCRIPTION = "The standard letter class letter has a label feature. You can \
activate it using \\makelabels. While in Germany window \
envelopes are common, printing labels is not common, and \
scrlttr2 has never supported label printing. Using \
makelabels.lco does implement a \\makelabels feature similar to \
the standard letter classes. Currently there are (almost) no \
configuration features for makelabels.lco. But you may use the \
envlab package after loading makelabels.lco to get various \
configuration features."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn60255"

RPM_NAME = "texlive-makelabels-2023.208.1.0svn60255-53.1.noarch.rpm"
RPM_HASH = "2c9b4f876e94b9f8c00b1786b43832c212bc3c99efecfcedab542f636a639693446b070d482b17f0a4a83f8b0f5be0eb5752f0573f702991bf42174d322bc874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makelabels"

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
