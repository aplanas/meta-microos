SUMMARY = "Include fragments of a dvi file"
DESCRIPTION = "Provides a mechanism to include fragments of dvi files with the \
graphicx package, so that you can use \\includegraphics to \
include dvi files. The package requires the dvipaste program."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-2023.201.0.0.2svn17354-53.1.noarch.rpm"
RPM_HASH = "fd09571857ed1a7ef785c903c34fb8ee0bd01bc6ef55cb5200e359b4e73217edd1b845cc2d7db9cdfaceef905eb7ef3f5b94158c1703328ae582e22a1db8c4d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfpaste.sty \
texlive-grfpaste"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
