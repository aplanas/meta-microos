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

PV = "2023.209.2.7svn61217"

RPM_NAME = "texlive-mf2pt1-2023.209.2.7svn61217-55.1.noarch.rpm"
RPM_HASH = "fb60e944598de1d8489cc6d0d614ab37a483ee5951ac59566b9532c74d0fd73a97567d79ab461a5566e44bf81b313b54d543fd552bdb729ea44664e17dff0b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mf2pt1"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Spec \
perl-Getopt--Long \
perl-Math--Trig \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mf2pt1-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
