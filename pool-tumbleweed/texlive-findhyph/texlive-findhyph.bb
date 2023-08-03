SUMMARY = "Find hyphenated words in a document"
DESCRIPTION = "Findhyph is a Perl script that will analyse the log file from \
running your document with \\tracingparagraphs=1 set. The output \
contains enough context to enable you to find the hyphenated \
word that's being referenced."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.4svn47444"

RPM_NAME = "texlive-findhyph-2023.209.3.4svn47444-53.1.noarch.rpm"
RPM_HASH = "902cee7450ba205e840093b5ef0bbd2db90b5e1db86d2064a32e6b658725441bac6c5e4c880b211d6fc1cd8b665a7154e63c45306bd51d4dbc73b424792754a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-findhyph"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Std \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-findhyph-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
