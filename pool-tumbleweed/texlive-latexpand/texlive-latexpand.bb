SUMMARY = "Expand \\input and \\include in a LaTeX document"
DESCRIPTION = "Latexpand is a Perl script that simply replaces \\input and \
\\include commands with the content of the input or included \
file. The script does not deal with \\includeonly commands."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.7.2svn66226"

RPM_NAME = "texlive-latexpand-2023.209.1.7.2svn66226-55.1.noarch.rpm"
RPM_HASH = "d826908ba69f3d9f2bc766d14e6641a9f523f53dd64e589fa1cc8b72a3a02525673dfa24ac705a3c0ad59f3e5af650784064f99e1634dcec3bf7028282a64d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexpand"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Spec \
perl-Getopt--Long \
perl-IO--Handle \
perl-open \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexpand-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
