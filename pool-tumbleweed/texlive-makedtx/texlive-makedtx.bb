SUMMARY = "Perl script to help generate dtx and ins files"
DESCRIPTION = "The makedtx bundle is provided to help LaTeX2e developers to \
write the code and documentation in separate files, and then \
combine them into a single .dtx file for distribution. It \
automatically generates the character table, and also writes \
the associated installation (.ins) script."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn46702"

RPM_NAME = "texlive-makedtx-2023.201.1.2svn46702-52.1.noarch.rpm"
RPM_HASH = "8c3923a0c22659a3aa2c34802607a1697d2fb45a9cb2080dceeffe6425bd2c799a8dbc92a0580b95eeb0c46b87db8fe99819ac0ab9c6cb2ed5425b8170eeae13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(createdtx.sty) \
texlive-makedtx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Getopt::Long) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-makedtx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
