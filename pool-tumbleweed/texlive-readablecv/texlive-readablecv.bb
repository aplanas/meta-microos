SUMMARY = "A highly readable and good looking CV and letter class"
DESCRIPTION = "This class provides, what I have found, to be an extremely \
attractive and highly readable CV which will lead to your CV \
being read rather than disgarded."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn61719"

RPM_NAME = "texlive-readablecv-2023.209.3.0svn61719-54.2.noarch.rpm"
RPM_HASH = "c8245ca203e82c0dec5453eb98771a5ae086a0406a57b51589b6accd68e5b3c59f33c26ccc19952d9f67d4fad4bd8ad152d6ac30a4aa0452312669e239ec1726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ReadableCV.cls \
texlive-readablecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-marvosym.sty \
tex-memoir.cls \
tex-multicol.sty \
tex-roboto.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
