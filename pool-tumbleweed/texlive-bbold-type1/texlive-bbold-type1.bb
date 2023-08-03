SUMMARY = "An Adobe Type 1 format version of the bbold font"
DESCRIPTION = "The files offer an Adobe Type 1 format version of the 5pt, 7pt \
and 10pt versions of the bbold fonts. The distribution also \
includes a map file, for use when incorporating the fonts into \
TeX documents; the macros provided with the original Metafont \
version of the font serve for the scaleable version, too. The \
fonts were produced to be part of the TeX distribution from \
Y&Y; they were generously donated to the TeX Users Group when \
Y&Y closed its doors as a business."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn33143"

RPM_NAME = "texlive-bbold-type1-2023.209.svn33143-54.1.noarch.rpm"
RPM_HASH = "85b54bb9ef7473471d960a03e9697a3fa376ccb78c97373d3a6020c47c927d5866b24a6f6765051c7035fd8df3f5e65b89106a16f5a0ececdef0d8fecda9e68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbold.map \
texlive-bbold-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-bbold-type1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
