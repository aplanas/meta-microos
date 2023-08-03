SUMMARY = "Commands to control PDF readers, under X11"
DESCRIPTION = "The command-line programs pdfopen and pdfclose allow you to \
control the X Window System version of Adobe's Acrobat Reader \
from the command line or from within a (shell) script. The \
programs work with Acrobat Reader 5, 7, 8 and 9 for Linux, xpdf \
and evince. This version derives from one written by Fabrice \
Popineau for Microsoft operating systems."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.86svn65952"

RPM_NAME = "texlive-xpdfopen-2023.209.0.0.86svn65952-53.1.noarch.rpm"
RPM_HASH = "3f58efc8ef0eaa58453809e8ca3a082b185470693c8d1bb724549baa2bec663f7b4d1261b5250591c34c622a7ebf1d6e445d36afe5892443cf62ccbc0f695370"
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
