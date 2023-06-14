SUMMARY = "Adobe Photoshop Data format (PSD) support for graphicx package"
DESCRIPTION = "This package provides Adobe Photoshop Data format (PSD) support \
for the graphicx package with the sips (Darwin/macOS) or \
convert (ImageMagick) command."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-2023.201.1.2svn57341-53.1.noarch.rpm"
RPM_HASH = "64cf79bde714af0baeba77851f29f51630176ccdb5405ef2591a631abed774394891b69437f02e5f89af8a0f16b25894c74a76aaa4e4f43994128d6634b92718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicxpsd.sty \
texlive-graphicxpsd"

RDEPENDS:${PN} += "/bin/sh \
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
