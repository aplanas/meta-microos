SUMMARY = "Generate a texmf tree for a particular job"
DESCRIPTION = "The package provides a Perl script, which runs a program and \
tries to find the names of file used. Two methods are \
available, option -recorder of (Web2C) TeX and the program \
strace. Then it generates a directory with a texmf tree. It \
checks the found files and tries sort them in this texmf tree. \
The script may be used for archiving purposes or to speed up \
later TeX runs."
LICENSE = "Artistic-1.0"

PV = "2023.209.0.0.8svn29725"

RPM_NAME = "texlive-mkjobtexmf-2023.209.0.0.8svn29725-55.1.noarch.rpm"
RPM_HASH = "5e2dee6279706563c38038ad5bd97ffee14a52ec7df1be0bb9fe68558ae78538235f87f307b851f33f1ed0955e96866376bf47855f34fe01df6f2bc0a148fb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkjobtexmf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
