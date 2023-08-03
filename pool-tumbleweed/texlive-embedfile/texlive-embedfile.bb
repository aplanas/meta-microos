SUMMARY = "Embed files into PDF"
DESCRIPTION = "This package embeds files in a PDF document, using the PDF \
format's embedding operation (note the contrast with the attach \
operation used by the attachfile and attachfile2 packages). \
Currently only pdfTeX >=1.30, in PDF mode, is supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn65528"

RPM_NAME = "texlive-embedfile-2023.209.2.12svn65528-54.1.noarch.rpm"
RPM_HASH = "91be95436f5a7a17ef6e2838258dc5488aa98c42789ecad2577625342dc847a483a65caf2db7dd96b96323163f055b8b4ee8ebfb17c20a4d0eb1170c63451fe2"
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
