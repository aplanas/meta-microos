SUMMARY = "Extendable dotted arrows"
DESCRIPTION = "The package can draw dotted arrows that are extendable, in the \
same was as \\xrightarrow."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01asvn15878"

RPM_NAME = "texlive-dotarrow-2023.209.0.0.01asvn15878-53.1.noarch.rpm"
RPM_HASH = "fdf43f10bf4972fc7e053e4000323d9dc47d2dbe2aeb2df32f24df76d0a54312b247dec62f42b0156494e7898bc4b9b4eaf421bbb72ce769b8526c33fa879465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DotArrow.sty \
texlive-dotarrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
