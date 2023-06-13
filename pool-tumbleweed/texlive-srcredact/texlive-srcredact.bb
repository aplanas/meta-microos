SUMMARY = "A tool for redacting sources"
DESCRIPTION = "This package provides a tool to keep a master source, \
consisting of different 'chunks' intended for different \
audiences. The tool allows to extract the versions intended for \
different audiences and to incorporate the changes made in any \
of these versions into the master document. This work was \
commissioned by the Consumer Financial Protection Bureau, \
United States Treasury."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn38710"

RPM_NAME = "texlive-srcredact-2023.201.1.0svn38710-57.1.noarch.rpm"
RPM_HASH = "ab3257c4bdad0b7c66bdc7ea43cdb5b5bdfa1b8335a16fb47b9edb6e7f9e2a252e117f243b5bb96569ba126102e744cabb930c1c691f0a2eb92256b6d372f15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srcredact"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(File::Temp) \
perl(Getopt::Std) \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-srcredact-bin"

inherit rpm
