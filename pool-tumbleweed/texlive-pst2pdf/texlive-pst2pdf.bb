SUMMARY = "A script to compile PSTricks documents via pdfTeX"
DESCRIPTION = "The script extracts the preamble of the document and runs all \
\\begin{postscript}...\\end{postscript} \
\\begin{pspicture}...\\end{pspicture} and \
\\pspicture...\\endpspicture separately through LaTeX with the \
same preamble as the original document; thus it creates EPS, \
PNG and PDF files of these snippets. In a final pdfLaTeX run \
the script replaces the environments with \\includegraphics to \
include the processed snippets. Detail documentation is \
acquired from the document itself via Perldoc."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-2023.209.0.0.20svn56172-54.1.noarch.rpm"
RPM_HASH = "a4ad238d87f2eacdd09d0944d54067dcce8f7c8d258ac17810a12b01d9a2b28619a6163eb62ac207c4a27ff0f4114d7108291ef462043ddfb74217d0b36fe64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Archive--Tar \
perl-Config \
perl-Cwd \
perl-Data--Dumper \
perl-Env \
perl-File--Basename \
perl-File--Copy \
perl-File--Find \
perl-File--Path \
perl-File--Spec--Functions \
perl-File--Temp \
perl-FileHandle \
perl-Getopt--Long \
perl-IO--Compress--Zip \
perl-POSIX \
perl-Term--ANSIColor \
perl-autodie \
perl-if \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pst2pdf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
