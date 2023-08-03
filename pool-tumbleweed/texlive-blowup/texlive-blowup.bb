SUMMARY = "Upscale or downscale all pages of a document"
DESCRIPTION = "The package blowup only defines the user-level macro \\blowUp, \
which can be used to upscale or downscale all pages of a \
document. It is similar to the TeX primitive \\magnification but \
more accurate and user-friendly."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn64466"

RPM_NAME = "texlive-blowup-2023.209.2.1.0svn64466-53.1.noarch.rpm"
RPM_HASH = "4e894842a9128964473d654a85c59bf9f6f53f4e600c1b959d2e413c7a17f3bd46c2ee17d6bcae0eaa65408eb44b6aa228cc64c5198c289f6dc49df0ba90eb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blowup.sty \
texlive-blowup"

RDEPENDS:${PN} += "/usr/bin/sh \
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
