SUMMARY = "Extract LaTeX environments into separate image files"
DESCRIPTION = "ltximg is a Perl script that automates the process of \
extracting and converting environments provided by TikZ, \
PStricks and other packages from input file to image formats \
and standalone files using ghostscript and poppler-utils. It \
generates a file with only extracted environments and another \
with all extracted environments converted to \\includegraphics."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn59335"

RPM_NAME = "texlive-ltximg-2023.201.2.1svn59335-52.1.noarch.rpm"
RPM_HASH = "7bc55002d04c6b15605fe880fd8de7718b031c6b22493157210e8cbd0dc3532505a2e8d369c936feef3682945a8dc939ec1110c2035924456f8ef17bb49efcd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltximg"

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
texlive-ltximg-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
