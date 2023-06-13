SUMMARY = "Crop PDF graphics"
DESCRIPTION = "A Perl script that can either trim pages of any whitespace \
border, or trim them of a fixed border."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.40svn55435"

RPM_NAME = "texlive-pdfcrop-2023.201.1.40svn55435-51.1.noarch.rpm"
RPM_HASH = "cdf0745114fc234e6b5d3ce3e7b2b34f75154c5da5898ac0ef28e4743589b88bdf971f0d705ba23db4f32e5eefb35fce1d4165862271319cfd9f00e475ec4cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcrop"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Config) \
perl(File::Copy) \
perl(File::Spec) \
perl(File::Spec::Functions) \
perl(Getopt::Long) \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfcrop-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
