SUMMARY = "Filter clutter from the output of a TeX run"
DESCRIPTION = "The package provides a small Perl script to filter the online \
output from a TeX run, attempting to show only those messages \
which probably deserve some change in the source. The TeX \
invocation itself need not change."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.48svn65545"

RPM_NAME = "texlive-texfot-2023.209.1.48svn65545-55.1.noarch.rpm"
RPM_HASH = "d663378b92233a08b73f64e40a43541c568ab185b5cc09e23da77488b2c44c2f4cb98eceb83890798c77914eed92cfd5310783ae6f88cbc0c8bb8f3955934aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texfot"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-IO--File \
perl-IPC--Open3 \
perl-Pod--Usage \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texfot-bin"

inherit rpm
