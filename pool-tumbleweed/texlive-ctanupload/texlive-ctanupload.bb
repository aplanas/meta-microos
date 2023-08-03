SUMMARY = "Support for users uploading to CTAN"
DESCRIPTION = "The package provides a Perl script that allows the uploads of a \
contribution to CTAN from the command line. The aim is to \
simplify the release process for LaTeX package authors. Note by \
the CTAN team (2015-02-05): It seems that this script is \
currently not working."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2csvn26313"

RPM_NAME = "texlive-ctanupload-2023.209.1.2csvn26313-55.1.noarch.rpm"
RPM_HASH = "31e7276543aaead7460b67b1724f9b26c4062cb29a969e1bc73c7e265f7d0bb4cb5d97a2d92424c90669ea96247b505e8c8088d203d9561368d165b9746a6852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanupload"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-HTML--FormatText \
perl-HTML--TreeBuilder \
perl-WWW--Mechanize \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-ctanupload-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
