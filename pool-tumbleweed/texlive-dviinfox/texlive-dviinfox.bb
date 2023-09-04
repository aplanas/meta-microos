SUMMARY = "Perl script to print DVI meta information"
DESCRIPTION = "The package provides a perl script which prints information \
about a DVI file. It also supports XeTeX XDV format."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn59216"

RPM_NAME = "texlive-dviinfox-2023.209.1.06svn59216-54.2.noarch.rpm"
RPM_HASH = "8dfc6a91f8bfad01227fed44462d38122d957006b28f7c01245bed4a8db17c147e66cc2b7695e3045a3d2362b7296d96efccff1f2ced7fbd1a4b76f572cd2486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-dviinfox-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
