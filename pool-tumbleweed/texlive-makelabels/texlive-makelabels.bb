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

PV = "2023.201.1.0svn60255"

RPM_NAME = "texlive-makelabels-2023.201.1.0svn60255-52.1.noarch.rpm"
RPM_HASH = "5d88a7491c3458fe976f3d024e15f11743cf21260381b8b97da0f986f65872704c1e7624f7a24f8da20a410fa0008b7a10aa9f65d54dd0b657a96228c97b7599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makelabels"
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
