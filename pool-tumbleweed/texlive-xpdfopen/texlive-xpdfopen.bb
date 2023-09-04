SUMMARY = "Commands to control PDF readers, under X11"
DESCRIPTION = "The command-line programs pdfopen and pdfclose allow you to \
control the X Window System version of Adobe's Acrobat Reader \
from the command line or from within a (shell) script. The \
programs work with Acrobat Reader 5, 7, 8 and 9 for Linux, xpdf \
and evince. This version derives from one written by Fabrice \
Popineau for Microsoft operating systems."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.86svn65952"

RPM_NAME = "texlive-xpdfopen-2023.209.0.0.86svn65952-53.2.noarch.rpm"
RPM_HASH = "352a766bc74b5b85c99ca5f1f4d8fcd16bfa30cf98c6b5a5781e1fb63589d71c6681fbf8d0cc220936b0b89d0e8c0b73b71628521a33798106d61428ca17617b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfclose.1 \
man-pdfopen.1 \
texlive-pdftools-doc-/usr/share/man/man1/pdfclose.1.gz \
texlive-pdftools-doc-/usr/share/man/man1/pdfopen.1.gz \
texlive-xpdfopen"

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
texlive-scripts-bin \
texlive-xpdfopen-bin"

inherit rpm
