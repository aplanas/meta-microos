SUMMARY = "A tool for redacting sources"
DESCRIPTION = "This package provides a tool to keep a master source, \
consisting of different 'chunks' intended for different \
audiences. The tool allows to extract the versions intended for \
different audiences and to incorporate the changes made in any \
of these versions into the master document. This work was \
commissioned by the Consumer Financial Protection Bureau, \
United States Treasury."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn38710"

RPM_NAME = "texlive-srcredact-2023.209.1.0svn38710-58.1.noarch.rpm"
RPM_HASH = "325061f9e28c93f7edf7696b563b0362828a32178c244206be34f9a1742593680278698be1282ad76492895c6a69a4f905cd0867df7ac06d5fc92deafadf2a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srcredact"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Temp \
perl-Getopt--Std \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-srcredact-bin"

inherit rpm
