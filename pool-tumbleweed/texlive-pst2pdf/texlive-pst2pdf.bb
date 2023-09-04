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

RPM_NAME = "texlive-pst2pdf-2023.209.0.0.20svn56172-54.2.noarch.rpm"
RPM_HASH = "773b5dd83150a1d75c8d9368aee7c65b70fb67a244b8aac78de860826fc42ff5dd231b4e295604eedf9604e55a866931b47a73a091ac45e2264192d279f9a9f0"
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
