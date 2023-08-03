SUMMARY = "Perl interface to mfpic"
DESCRIPTION = "mkpic provides an easy interface for making small pictures with \
mfpic. To this end you create an input file consisting of \
commands, one per line, with space separated parameters (or you \
modify the DATA section of the mkpic script, which is used if \
you run it without an input file). For an extensive description \
see the file mkpicdoc.pdf, which is part of the distribution."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02svn33700"

RPM_NAME = "texlive-mkpic-2023.209.1.02svn33700-55.1.noarch.rpm"
RPM_HASH = "b0370908f1e6682d8aef603b61404bd3d1f9f5ce63127e59455e35434bb7cbc1f25131cb17c83dd2d356a97760a1a6290f242bacd0d2cd5b3fc0d37a9b101f85"
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
