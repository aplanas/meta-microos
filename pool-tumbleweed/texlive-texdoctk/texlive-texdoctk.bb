SUMMARY = "Easy access to package documentation"
DESCRIPTION = "A Perl/Tk-based GUI for easy access to package documentation \
for TeX on Unix platforms; the databases it uses are based on \
the texmf/doc subtrees of teTeX, but database files for local \
configurations with modified/extended directories can be \
derived from them. Note that texdoctk is not a viewer itself, \
but an interface for finding documentation files and opening \
them with the appropriate viewer; so it relies on appropriate \
programs to be installed on the system. However, the choice of \
these programs can be configured by the sysadmin or user. Now \
only distributed as part of TeX Live, which includes a Windows \
executable."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6.0svn62186"

RPM_NAME = "texlive-texdoctk-2023.209.0.0.6.0svn62186-55.1.noarch.rpm"
RPM_HASH = "05b4fe401d9cefb361e26bb74bab8e0d62c80dbbd8d7717fde9285089440e361c9106b05653bdcb1f49a0f9983f090ae8eedefd2d8e66e9def5066ced30140c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdoctk.dat \
texlive-texdoctk"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-File--Copy \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdoctk-bin"

inherit rpm
