SUMMARY = "Upscale or downscale all pages of a document"
DESCRIPTION = "The package blowup only defines the user-level macro \\blowUp, \
which can be used to upscale or downscale all pages of a \
document. It is similar to the TeX primitive \\magnification but \
more accurate and user-friendly."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn64466"

RPM_NAME = "texlive-blowup-2023.201.2.1.0svn64466-52.1.noarch.rpm"
RPM_HASH = "115e8291b3a538f827de08eed6f4cf4a0dc43dca228c08586d9636aeeef9de3f4ecfafe9ca8d2b6e655285caf018e6b680ae0ac99ad036fe00e0ca888ee29a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blowup.sty \
texlive-blowup"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-graphics.sty \
tex-iftex.sty \
tex-keyval.sty \
tex-typearea.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
