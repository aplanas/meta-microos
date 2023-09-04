SUMMARY = "Adobe Photoshop Data format (PSD) support for graphicx package"
DESCRIPTION = "This package provides Adobe Photoshop Data format (PSD) support \
for the graphicx package with the sips (Darwin/macOS) or \
convert (ImageMagick) command."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-2023.209.1.2svn57341-54.2.noarch.rpm"
RPM_HASH = "4eacbe8cc63b2004892dc7e3e440f11ef79d2a95ff4ad87e2a02efac985028a0439b16c745e194167609a558965bbac2a38921ff8ddc1e6220dc141a4ae01e34"
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
