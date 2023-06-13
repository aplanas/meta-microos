SUMMARY = "Giving meaning to various Unicode space characters"
DESCRIPTION = "LaTeX package that gives meaning to various Unicode space \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.05svn63123"

RPM_NAME = "texlive-uspace-2023.201.0.0.05svn63123-53.1.noarch.rpm"
RPM_HASH = "f9807923f99fc84b80f6adb4412804e4cb7911bffe38134b1ea7c4c65df08c5d9c1e735de00ca4cda989ded8cab30af16dfeacdb7a7b8ab8adf3fa5d95c12af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uspace.sty) \
texlive-uspace"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(inputenc.sty) \
tex(newunicodechar.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
