SUMMARY = "Extract LaTeX environments into separate image files"
DESCRIPTION = "ltximg is a Perl script that automates the process of \
extracting and converting environments provided by TikZ, \
PStricks and other packages from input file to image formats \
and standalone files using ghostscript and poppler-utils. It \
generates a file with only extracted environments and another \
with all extracted environments converted to \\includegraphics."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.1svn59335"

RPM_NAME = "texlive-ltximg-2023.208.2.1svn59335-53.1.noarch.rpm"
RPM_HASH = "75ea2c2da2f968a9e2d445b198f22fc0555b8e902bdf3b078acc7add6a2997e4dfd6a1b33a8cd9ce283e5dbda8b56c4f0b1191e0f2d1ed0d0ddd42b3b5feeef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltximg"

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
texlive-ltximg-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
