SUMMARY = "Perl script to help generate dtx and ins files"
DESCRIPTION = "The makedtx bundle is provided to help LaTeX2e developers to \
write the code and documentation in separate files, and then \
combine them into a single .dtx file for distribution. It \
automatically generates the character table, and also writes \
the associated installation (.ins) script."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn46702"

RPM_NAME = "texlive-makedtx-2023.208.1.2svn46702-53.1.noarch.rpm"
RPM_HASH = "f444c7cc4286c1dedf858e45705ac782ff2d29296da25d34ceb03533f305c829d028e57e54d6cb8d65e925e6631736b2a92419c8d24ab64cb1d285df8c0d46db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-createdtx.sty \
texlive-makedtx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-makedtx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
