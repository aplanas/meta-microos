SUMMARY = "Support software for downscaling graphics to be included by pdfLaTeX"
DESCRIPTION = "The package provides a script to scale pictures down to a \
target resolution before creating a PDF document with pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.32svn46617"

RPM_NAME = "texlive-pdflatexpicscale-2023.201.0.0.32svn46617-51.1.noarch.rpm"
RPM_HASH = "7b9cb6493de54c3f8ec7af65af4636f7ea50910fe904a61e7ee9da4d9566093460a8105e31f8c9832bb6c3a8399ad27ee4e79f9a3f9e4b1f730640eeedcb575a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflatexpicscale"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(File::Basename) \
perl(File::Copy) \
perl(File::Spec) \
perl(Getopt::Long) \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdflatexpicscale-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
