SUMMARY = "Commands to control PDF readers, under X11"
DESCRIPTION = "The command-line programs pdfopen and pdfclose allow you to \
control the X Window System version of Adobe's Acrobat Reader \
from the command line or from within a (shell) script. The \
programs work with Acrobat Reader 5, 7, 8 and 9 for Linux, xpdf \
and evince. This version derives from one written by Fabrice \
Popineau for Microsoft operating systems."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.86svn65952"

RPM_NAME = "texlive-xpdfopen-2023.201.0.0.86svn65952-52.2.noarch.rpm"
RPM_HASH = "f9fb574e443afd13e16a3a8bb214aff7983c2c5f7d9b6b0495636cce5b0d521d33ac82b165af9c0c1c92b8c3d01ea732a9e75cbd11a2ede0d63b14715f6d31ba"
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
