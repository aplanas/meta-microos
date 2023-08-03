SUMMARY = "Generate changebars in LaTeX documents"
DESCRIPTION = "Identify areas of text to be marked with changebars with the \
\\cbstart and \\cbend commands; the bars may be coloured. The \
package uses 'drivers' to place the bars; the available drivers \
can work with dvitoln03, dvitops, dvips, the emTeX and TeXtures \
DVI drivers, and VTeX and pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6dsvn63259"

RPM_NAME = "texlive-changebar-2023.209.3.6dsvn63259-53.1.noarch.rpm"
RPM_HASH = "5b8cd6815cd79522baa4b4e27eb973a8d1db566c6d8e0d10e03afd1ac857d0377266b5156e29f509ddb675cb85ea157e99d7a620b88a0981e86a5b7d106ad9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changebar.sty \
texlive-changebar"

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
