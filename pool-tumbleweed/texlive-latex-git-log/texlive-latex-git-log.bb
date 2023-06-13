SUMMARY = "Typeset git log information"
DESCRIPTION = "The program is run within a git repository, and outputs the \
entire version history, as a LaTeX table. That output will \
typically be redirected to a file; the author recommends \
typesetting in landscape orientation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.0svn54010"

RPM_NAME = "texlive-latex-git-log-2023.201.1.0.0svn54010-55.1.noarch.rpm"
RPM_HASH = "ef480fdba90e1f7ac893b81a005187a09f5b7530500982862bdfb30fc9759c04f39f396720a3f139d1bdaff38657418be6837524c856dce5d668dca2e26833e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-git-log"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(File::Basename) \
perl(Getopt::Long) \
perl(IPC::System::Simple) \
perl(Locale::Maketext::Simple) \
perl(Pod::Usage) \
perl(autodie) \
perl(feature) \
perl(open) \
perl(strict) \
perl(utf8) \
perl(warnings) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-git-log-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
