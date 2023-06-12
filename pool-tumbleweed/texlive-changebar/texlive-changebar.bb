SUMMARY = "Generate changebars in LaTeX documents"
DESCRIPTION = "Identify areas of text to be marked with changebars with the \
\\cbstart and \\cbend commands; the bars may be coloured. The \
package uses 'drivers' to place the bars; the available drivers \
can work with dvitoln03, dvitops, dvips, the emTeX and TeXtures \
DVI drivers, and VTeX and pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6dsvn63259"

RPM_NAME = "texlive-changebar-2023.201.3.6dsvn63259-52.1.noarch.rpm"
RPM_HASH = "184fc83f51b331e5052a6e22d1829d5003a1390e21f50897e217e29ec1998872785290e783d007fa7a6d68a1f7dc6df021ab132444542b028fa74e78bece814b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(changebar.sty) \
texlive-changebar"
RDEPENDS:${PN} += "/bin/sh \
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
