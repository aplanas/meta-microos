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

RPM_NAME = "texlive-pst2pdf-2023.201.0.0.20svn56172-53.1.noarch.rpm"
RPM_HASH = "f1b881609178194be524cc45fa8cfcf0d9e1eddeb855fcf71fb0d29f5851f041ec5c42d153188c5bfe373bb60bb9c17711e19a680e7e32ed615509ac7321dbe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Archive::Tar) \
perl(Config) \
perl(Cwd) \
perl(Data::Dumper) \
perl(Env) \
perl(File::Basename) \
perl(File::Copy) \
perl(File::Find) \
perl(File::Path) \
perl(File::Spec::Functions) \
perl(File::Temp) \
perl(FileHandle) \
perl(Getopt::Long) \
perl(IO::Compress::Zip) \
perl(POSIX) \
perl(Term::ANSIColor) \
perl(autodie) \
perl(if) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pst2pdf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
