SUMMARY = "Adobe Photoshop Data format (PSD) support for graphicx package"
DESCRIPTION = "This package provides Adobe Photoshop Data format (PSD) support \
for the graphicx package with the sips (Darwin/macOS) or \
convert (ImageMagick) command."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-2023.201.1.2svn57341-53.2.noarch.rpm"
RPM_HASH = "906eeafb0cceeaba5c761be8800528df91760e2ca517b4a85d9b89cde44d24d26563a1032f36bd7bf75cd3e88e310344d875a80e2293b7ff9fb7cf3c36e044c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicxpsd.sty \
texlive-graphicxpsd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
