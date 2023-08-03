SUMMARY = "Adobe Photoshop Data format (PSD) support for graphicx package"
DESCRIPTION = "This package provides Adobe Photoshop Data format (PSD) support \
for the graphicx package with the sips (Darwin/macOS) or \
convert (ImageMagick) command."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-2023.209.1.2svn57341-54.1.noarch.rpm"
RPM_HASH = "e95aad04821537ec9b70bb1dc7d69800dd6c8fcc8823d80b524db197aad55b133806d49e7d63867cd3592ceed5225b9132a531df3f3a8ef0d7902391cc5c1cf4"
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
