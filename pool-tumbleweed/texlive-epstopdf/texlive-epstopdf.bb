SUMMARY = "Convert EPS to PDF using Ghostscript"
DESCRIPTION = "Epstopdf is a Perl script that converts an EPS file to an \
'encapsulated' PDF file (a single page file whose media box is \
the same as the original EPS's bounding box). The resulting \
file suitable for inclusion by pdfTeX as an image. The script \
is adapted to run both on Windows and on Unix-alike systems. \
The script makes use of Ghostscript for the actual conversion \
to PDF. It assumes Ghostscript version 6.51 or later, and (by \
default) suppresses its automatic rotation of pages where most \
of the text is not horizontal. LaTeX users may make use of the \
epstopdf package, which will run the epstopdf script 'on the \
fly', thus giving the illusion that pdfLaTeX is accepting EPS \
graphic files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.31svn66461"

RPM_NAME = "texlive-epstopdf-2023.201.2.31svn66461-53.2.noarch.rpm"
RPM_HASH = "1893aeefbe87521fc77de2eedbd4399e9abd694ce8ed9f14fdd542c89b1511f1eaaa33d4247179f53cd154ffdd24ea35e7d4863907a033f6d6768995849e2845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
sed \
tex-epstopdf-base.sty \
texlive \
texlive-epstopdf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
