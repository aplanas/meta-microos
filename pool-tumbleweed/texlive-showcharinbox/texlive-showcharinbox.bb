SUMMARY = "Show characters inside a box"
DESCRIPTION = "The package typesets a character inside a box, showing where \
reference point is, and displaying width, height, and depth \
information of the character. The output is like that on page \
63 of 'The TeXBook' or page 101 of 'The METAFONTbook'. The \
package itself is motivated by Knuth's macros in the file \
manmac.tex. Users should note that using a small size for the \
character inside the box does not make any sense: use a large \
size."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29803"

RPM_NAME = "texlive-showcharinbox-2023.209.0.0.1svn29803-54.1.noarch.rpm"
RPM_HASH = "864a2a4f2fbb97c69182f8bd5b0264a58304036d258ed97b9f79c04b887daf1cd72f3eb7d8012b0d6da01ddabbe1eab892139b0133ef5c06ac2b0d5a91801602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showcharinbox.sty \
texlive-showcharinbox"

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
