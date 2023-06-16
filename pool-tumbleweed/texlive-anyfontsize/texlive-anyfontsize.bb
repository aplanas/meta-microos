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

PV = "2023.201.svn17050"

RPM_NAME = "texlive-anyfontsize-2023.201.svn17050-54.1.noarch.rpm"
RPM_HASH = "112f3ee5ece1649e5f32f99d1f0f9a4663b3f5e5ff2c62ef9908e9d8c91ed4e280c30fd7e72c76d0b5abb798d29593605dccee9168a0af5e52469a92af383799"
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
