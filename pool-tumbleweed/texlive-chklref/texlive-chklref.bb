SUMMARY = "Check for problems with labels in LaTeX"
DESCRIPTION = "It is quite common that after modifying a TeX file, many unused \
labels remain in it. The purpose of chklref is to automatically \
find these useless labels. It also looks for 'non starred' \
mathematical environments with no labels and advises the user \
to use a starred version instead."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1.2svn52649"

RPM_NAME = "texlive-chklref-2023.209.3.1.2svn52649-54.1.noarch.rpm"
RPM_HASH = "e4ffa3f24c1dde527525dea21dac0e1a571caec3c2ad789de1972bcc5a8a24533283ac9d35926fb69a32593d5de209a90d14cb9cde6ba95df887be01520a0dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chklref.sty \
texlive-chklref"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
tex-afterpackage.sty \
tex-auxhook.sty \
tex-currfile.sty \
texlive \
texlive-chklref-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
