SUMMARY = "Perl script to print DVI meta information"
DESCRIPTION = "The package provides a perl script which prints information \
about a DVI file. It also supports XeTeX XDV format."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn59216"

RPM_NAME = "texlive-dviinfox-2023.201.1.06svn59216-53.2.noarch.rpm"
RPM_HASH = "c9b198e9c8f0b89fd1241a0e0034086fde1f8e1f42cc4f7eeb68c5fb7704fe6537a94701d08d136abf13606cd90fc8c6df3c4a295584425da60eb8ed33bdfc2e"
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
