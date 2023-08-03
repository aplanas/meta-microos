SUMMARY = "Typeset git log information"
DESCRIPTION = "The program is run within a git repository, and outputs the \
entire version history, as a LaTeX table. That output will \
typically be redirected to a file; the author recommends \
typesetting in landscape orientation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.0svn54010"

RPM_NAME = "texlive-latex-git-log-2023.209.1.0.0svn54010-56.1.noarch.rpm"
RPM_HASH = "b29263d25779c2350bf015e6c7fce0524a5e4f19b9a038fba8688a7c10088c1e4b9c7a3f1a7270492b8750ebd586f073c6392d2e9b1d9786f7f9dfb0328ed16e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-git-log"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-Getopt--Long \
perl-IPC--System--Simple \
perl-Locale--Maketext--Simple \
perl-Pod--Usage \
perl-autodie \
perl-feature \
perl-open \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-git-log-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
