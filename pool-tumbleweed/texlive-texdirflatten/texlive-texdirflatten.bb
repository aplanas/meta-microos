SUMMARY = "Collect files related to a LaTeX job in a single directory"
DESCRIPTION = "The Perl script parses a LaTeX file recursively, scanning all \
child files, and collects details of any included and other \
data files. These component files, are then all put into a \
single directory (thus 'flattening' the document's directory \
tree)."
LICENSE = "Artistic-1.0"

PV = "2023.209.1.3svn55064"

RPM_NAME = "texlive-texdirflatten-2023.209.1.3svn55064-55.1.noarch.rpm"
RPM_HASH = "0832b9f5faa3283f8e9195a9c3c12b5c0ec309fa301364b69ad70f668ad7a5ce81b65b389f078f11bfb9afb2d91fb3a5d7c9055828aebb6d59c5e5f3b262941d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdirflatten"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-re \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdirflatten-bin"

inherit rpm
