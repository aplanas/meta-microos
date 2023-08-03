SUMMARY = "Two dingbat symbol fonts"
DESCRIPTION = "The fonts (ark10 and dingbat) are specified in Metafont; \
support macros are provided for use in LaTeX. An Adobe Type 1 \
version of the fonts is available in the niceframe fonts \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27918"

RPM_NAME = "texlive-dingbat-2023.209.1.0svn27918-53.1.noarch.rpm"
RPM_HASH = "47c93c1c7a3766643385d7e8f8f87ee10e572fc9cf78fd556efea4f391ac406dee00307c752a4efb7b97d07f26aaa0788bd42475b600f4b9d143f794171a4906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ark10.tfm \
tex-dingbat.sty \
tex-dingbat.tfm \
tex-uark.fd \
tex-udingbat.fd \
texlive-dingbat"

RDEPENDS:${PN} += "/usr/bin/sh \
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
