SUMMARY = "Embed files into PDF"
DESCRIPTION = "This package embeds files in a PDF document, using the PDF \
format's embedding operation (note the contrast with the attach \
operation used by the attachfile and attachfile2 packages). \
Currently only pdfTeX >=1.30, in PDF mode, is supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn65528"

RPM_NAME = "texlive-embedfile-2023.201.2.12svn65528-53.2.noarch.rpm"
RPM_HASH = "7b9a9d8f34529331ea297ba14a7ccd59cd4f717a6d2fc7ee5cacfc5f28f748c6be20871a717722312d62e4788128c2315d0da9b3911d3b51bec345e3a1c09e7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtx-attach.sty \
tex-embedfile.sty \
texlive-embedfile"

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
