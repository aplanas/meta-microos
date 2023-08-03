SUMMARY = "Determine and mark up significant differences between LaTeX files"
DESCRIPTION = "Latexdiff is a Perl script for visual mark up and revision of \
significant differences between two LaTeX files. Various \
options are available for visual markup using standard LaTeX \
packages such as color. Changes not directly affecting visible \
text, for example in formatting commands, are still marked in \
the LaTeX source. A rudimentary revision facilility is provided \
by another Perl script, latexrevise, which accepts or rejects \
all changes. Manual editing of the difference file can be used \
to override this default behaviour and accept or reject \
selected changes only."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3.3svn64980"

RPM_NAME = "texlive-latexdiff-2023.209.1.3.3svn64980-55.1.noarch.rpm"
RPM_HASH = "1dcf4ca655a10ca792227b3409bf0467e669ad3756c5bef5d5c00a0f97aea536763665e3da1a66aa8c5f19336ce61f553547ceac7e7ea7712a1696d73e0b18e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexdiff"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Exporter \
perl-File--Basename \
perl-File--Copy \
perl-File--Path \
perl-File--Spec \
perl-File--Temp \
perl-Getopt--Long \
perl-IPC--Open2 \
perl-IPC--Open3 \
perl-Pod--Usage \
perl-constant \
perl-integer \
perl-strict \
perl-utf8 \
perl-vars \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexdiff-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
