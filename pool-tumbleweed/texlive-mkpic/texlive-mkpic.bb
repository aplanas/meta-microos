SUMMARY = "Perl interface to mfpic"
DESCRIPTION = "mkpic provides an easy interface for making small pictures with \
mfpic. To this end you create an input file consisting of \
commands, one per line, with space separated parameters (or you \
modify the DATA section of the mkpic script, which is used if \
you run it without an input file). For an extensive description \
see the file mkpicdoc.pdf, which is part of the distribution."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn33700"

RPM_NAME = "texlive-mkpic-2023.201.1.02svn33700-54.1.noarch.rpm"
RPM_HASH = "c6eb0f429bff29b3065e6ad4287eee08c7b277d85eb408729f83e199875b2d022b0a2089eb8177f4792bf5106b85aa3dd2a67a1a40f9ee304620e02aae7cdb46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpic"

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
texlive-mkpic-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
