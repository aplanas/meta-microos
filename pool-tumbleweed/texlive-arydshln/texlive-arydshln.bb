SUMMARY = "Draw dash-lines in array/tabular"
DESCRIPTION = "The package is to draw dash-lines in array/tabular \
environments. Horizontal lines are drawn by \\hdashline and \
\\cdashline while vertical ones can be specified as a part of \
the preamble using ':'. The shape of dash-lines may be \
controlled through style parameters or optional arguments. The \
package is compatible with array, colortab, longtable, and \
colortbl."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.76svn50084"

RPM_NAME = "texlive-arydshln-2023.201.1.76svn50084-53.1.noarch.rpm"
RPM_HASH = "d3472491fe5d7c2457c6de0cf91f036d16b1fbfe9ab3faf5f2f97211856e2869a0f92d9bb0b3348f41357a0458781abf45e07239d726b99c0e067e57467dba8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arydshln.sty \
texlive-arydshln"

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
