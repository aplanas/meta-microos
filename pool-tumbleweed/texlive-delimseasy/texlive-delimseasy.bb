SUMMARY = "Delimiter commands that are easy to use and resize"
DESCRIPTION = "This package provides commands to give a consistent, \
easy-to-remember, easy to edit way to control the size and \
blackness of delimiters: append 1-4 'b's to command for larger \
sizes; prepend 'B' for for boldface. These commands reduce the \
likelihood of incomplete delimeter pairs and typically use \
fewer characters than the LaTeX default."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn39589"

RPM_NAME = "texlive-delimseasy-2023.201.2.0svn39589-52.1.noarch.rpm"
RPM_HASH = "dd540489d5d76ab78c478ca63bc9474e135a63673a2cb4f04d5d63c5aa135edc6cf297afd3c5f2f0e1f67d2d3854dc8a4cbb3c1d2f71451a2ccc099c8852c4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimseasy.sty \
texlive-delimseasy"

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
