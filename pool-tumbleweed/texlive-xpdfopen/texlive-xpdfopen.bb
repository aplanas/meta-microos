SUMMARY = "Commands to control PDF readers, under X11"
DESCRIPTION = "The command-line programs pdfopen and pdfclose allow you to \
control the X Window System version of Adobe's Acrobat Reader \
from the command line or from within a (shell) script. The \
programs work with Acrobat Reader 5, 7, 8 and 9 for Linux, xpdf \
and evince. This version derives from one written by Fabrice \
Popineau for Microsoft operating systems."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.86svn65952"

RPM_NAME = "texlive-xpdfopen-2023.201.0.0.86svn65952-52.1.noarch.rpm"
RPM_HASH = "201be3ea8c0d35b2ba2dff8be96eb5b625f3a00fff042611629dbe542c802498eba56e0fe7d736b283867088734b9de402d3b816990d373f4e30456416159d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pdfclose.1) \
man(pdfopen.1) \
texlive-pdftools-doc:/usr/share/man/man1/pdfclose.1.gz \
texlive-pdftools-doc:/usr/share/man/man1/pdfopen.1.gz \
texlive-xpdfopen"

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
texlive-scripts-bin \
texlive-xpdfopen-bin"

inherit rpm
