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

PV = "2023.201.svn33143"

RPM_NAME = "texlive-bbold-type1-2023.201.svn33143-53.1.noarch.rpm"
RPM_HASH = "8a62651fada8327002d089283c87acca203c9e15f8b7ac66b08e7e3d2a19b7a31320b3bc04ad01cfc0500191c7d03eeb6d5ff23a2cf173a34121d0f61011d0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbold.map \
texlive-bbold-type1"

RDEPENDS:${PN} += "/bin/sh \
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
