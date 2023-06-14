SUMMARY = "Generate a texmf tree for a particular job"
DESCRIPTION = "The package provides a Perl script, which runs a program and \
tries to find the names of file used. Two methods are \
available, option -recorder of (Web2C) TeX and the program \
strace. Then it generates a directory with a texmf tree. It \
checks the found files and tries sort them in this texmf tree. \
The script may be used for archiving purposes or to speed up \
later TeX runs."
LICENSE = "Artistic-1.0"

PV = "2023.201.0.0.8svn29725"

RPM_NAME = "texlive-mkjobtexmf-2023.201.0.0.8svn29725-54.1.noarch.rpm"
RPM_HASH = "8cc583ad7a05a2a9b8ac9bae6cbb621011e48c0596fa3132d1f96c5a65b5063d9a2b21ad32f04ba2d842d736578d6437eb034be38fc138fd8338244caed96ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkjobtexmf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Copy \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mkjobtexmf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
