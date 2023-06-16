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

PV = "2023.201.0.0.6.0svn62186"

RPM_NAME = "texlive-texdoctk-2023.201.0.0.6.0svn62186-54.1.noarch.rpm"
RPM_HASH = "3780638002a97e36783c90d9bc65b3246a3dd3ba6be8b618bad1c3e44c668352713065eb24ea0fd8eb2b6dccbd8d142472a986c601ae0eefb383f0a70ebf537d"
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
