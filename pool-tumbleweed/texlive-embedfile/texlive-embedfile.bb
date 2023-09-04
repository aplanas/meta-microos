SUMMARY = "Embed files into PDF"
DESCRIPTION = "This package embeds files in a PDF document, using the PDF \
format's embedding operation (note the contrast with the attach \
operation used by the attachfile and attachfile2 packages). \
Currently only pdfTeX >=1.30, in PDF mode, is supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn65528"

RPM_NAME = "texlive-embedfile-2023.209.2.12svn65528-54.2.noarch.rpm"
RPM_HASH = "474ede1d127df5d55ab52fd990d24126a6529a4bafe5710e0163da63fbebeec08a88171b6a39cf0d9f5a9a1e9642563692bc87154edf446e578a2bcdfb2010e8"
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
