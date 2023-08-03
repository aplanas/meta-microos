SUMMARY = "Select any font size in LaTeX"
DESCRIPTION = "The package allows the to user select any font size (via e.g. \
\\fontsize{...}{...}\\selectfont), even those sizes that are not \
listed in the .fd file. If such a size is requested, LaTeX will \
search for and select the nearest listed size; anyfontsize will \
then scale the font to the size actually requested. Similar \
functionality is available for the CM family, for the EC \
family, or for either computer modern encoding; the present \
package generalises the facility."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17050"

RPM_NAME = "texlive-anyfontsize-2023.209.svn17050-55.1.noarch.rpm"
RPM_HASH = "674c4e132a311ed0d02e77140edbc98fbdf9e78f2050e048b409d459481a4f4bd2dfad661570b757bfc09cc713c1f954265482894962920441a5972a12a3bb05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anyfontsize.sty \
texlive-anyfontsize"

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
