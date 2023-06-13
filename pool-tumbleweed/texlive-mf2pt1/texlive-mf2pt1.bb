SUMMARY = "Convert stylized Metafont to PostScript Type 1"
DESCRIPTION = "mf2pt1 is a Perl script that facilitates producing PostScript \
Type 1 fonts from a Metafont source file. It is not, as the \
name may imply, an automatic converter of arbitrary Metafont \
fonts to Type 1 format. mf2pt1 imposes a number of restrictions \
on the Metafont input. If these restrictions are met, mf2pt1 \
will produce valid Type 1 output with more accurate control \
points than can be reverse-engineered by TeXtrace, mftrace, and \
other programs which convert bitmaps to outline fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn61217"

RPM_NAME = "texlive-mf2pt1-2023.201.2.7svn61217-54.1.noarch.rpm"
RPM_HASH = "1d9014b437e3bffb033929f50139c0bae984b02a685c66efddba9d58119e2eec514d137c41819aeac938eb57448a4190ba44e9100dfc2500ba4851913a67db99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mf2pt1"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(File::Basename) \
perl(File::Spec) \
perl(Getopt::Long) \
perl(Math::Trig) \
perl(Pod::Usage) \
perl(strict) \
perl(warnings) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mf2pt1-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
