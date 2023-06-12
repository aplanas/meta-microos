SUMMARY = "Expand \\input and \\include in a LaTeX document"
DESCRIPTION = "Latexpand is a Perl script that simply replaces \\input and \
\\include commands with the content of the input or included \
file. The script does not deal with \\includeonly commands."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.7.2svn66226"

RPM_NAME = "texlive-latexpand-2023.201.1.7.2svn66226-54.1.noarch.rpm"
RPM_HASH = "3fcf38c0fb8c38aeac16202d165fdf27bf821f7fd84934e306fbcfef253c4fa5f1e079de4d59322901662da6a31e2bd50c65209fde599f692c58f9f1848c6e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexpand"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(File::Spec) \
perl(Getopt::Long) \
perl(IO::Handle) \
perl(open) \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexpand-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
