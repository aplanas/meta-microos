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

RPM_NAME = "texlive-epstopdf-2023.201.2.31svn66461-53.1.noarch.rpm"
RPM_HASH = "8d43de9ce2270b32d7d3d9f697a84c31c393ac49105e6c9e8285121c3ee48edeb6640df12557e14a270d86de4fe98fa44b51e8ee420382cf9ec3c7cca21bb7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(File::Basename) \
perl(File::Temp) \
perl(Getopt::Long) \
sed \
tex(epstopdf-base.sty) \
texlive \
texlive-epstopdf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
