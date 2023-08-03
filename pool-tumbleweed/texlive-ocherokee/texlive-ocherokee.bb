SUMMARY = "LaTeX Support for the Cherokee language"
DESCRIPTION = "Macros and Type 1 fonts for Typesetting the Cherokee language \
with the Omega version of LaTeX (known as Lambda)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25689"

RPM_NAME = "texlive-ocherokee-2023.209.svn25689-55.1.noarch.rpm"
RPM_HASH = "1f550a7d5c817af068d5c78af5b1ef77a3694a3537d0abbafc1017d836fcc14a88ee3db4eeec67f41c5c39bca569e0f82199f348767dfaf7bd00fd6b0d555aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Cherokee.tfm \
tex-Cherokeeb.tfm \
tex-Cherokeebo.tfm \
tex-Cherokeeo.tfm \
tex-cherokee.map \
tex-lchcmr.fd \
tex-lchenc.def \
tex-ocherokee.sty \
texlive-ocherokee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ocherokee-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
