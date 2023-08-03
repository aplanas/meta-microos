SUMMARY = "Environments AsciiList and AsciiDocList for prototyping nested lists in LaTeX"
DESCRIPTION = "The asciilist provides the environments AsciiList and \
AsciiDocList, which enable quickly typesetting nested lists in \
LaTeX without having to type individual item macros or \
opening/closing list environments. The package provides \
auxiliary functionality for loading such lists from files and \
provides macros for configuring the use of the list \
environments and the appearance of the typeset results."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2bsvn49060"

RPM_NAME = "texlive-asciilist-2023.209.2.2bsvn49060-54.1.noarch.rpm"
RPM_HASH = "312d7e2c7bc678611266fb222ef6206bcbb541371c93afed6aa8f70529b6fe491f865282599dd27dbd570a8a3dd8bdb8a335bf58566e730beb1aada60b3533a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asciilist.sty \
texlive-asciilist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
