SUMMARY = "Draw dash-lines in array/tabular"
DESCRIPTION = "The package is to draw dash-lines in array/tabular \
environments. Horizontal lines are drawn by \\hdashline and \
\\cdashline while vertical ones can be specified as a part of \
the preamble using ':'. The shape of dash-lines may be \
controlled through style parameters or optional arguments. The \
package is compatible with array, colortab, longtable, and \
colortbl."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.76svn50084"

RPM_NAME = "texlive-arydshln-2023.209.1.76svn50084-54.1.noarch.rpm"
RPM_HASH = "1faa9d8e54abb7fef4cd2f885a156d64714a1a5a366406a5d30b499a00a940826df001282932e895a42add466477baae8b055ccb911f8b3882d419dde483e111"
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
