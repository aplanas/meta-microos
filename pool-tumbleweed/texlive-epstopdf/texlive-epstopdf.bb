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

PV = "2023.209.2.31svn66461"

RPM_NAME = "texlive-epstopdf-2023.209.2.31svn66461-54.1.noarch.rpm"
RPM_HASH = "b7d8f01ea6d61441870c7488453cbca4d78028b8de832a01477154431b8c699b3a5d3767061e4eac186deb170682b0efb50beb49bb8c38b9947a3aff998f80dd"
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
