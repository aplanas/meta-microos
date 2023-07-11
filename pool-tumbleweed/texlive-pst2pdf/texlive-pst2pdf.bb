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

PV = "2023.201.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-2023.201.0.0.20svn56172-53.2.noarch.rpm"
RPM_HASH = "7ffb8c9d4bef47d02ae7d2df31d47e2351105867d5f225046dd2e7bd99160ae6942361c42ac01c6729328c22823a7a5f30d767d15d33226cab15ccd41d403584"
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
