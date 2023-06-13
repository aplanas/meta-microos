SUMMARY = "Using psfrag with pdfLaTeX"
DESCRIPTION = "Fragmaster enables you to use psfrag with pdfLaTeX. It takes \
EPS files and psfrag substitution definition files, and \
produces PDF and EPS files with the substitutions included."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn26313"

RPM_NAME = "texlive-fragmaster-2023.201.1.6svn26313-52.1.noarch.rpm"
RPM_HASH = "fa386938c06b39becf952f85c9a8dc4e85d530e271d168f775a42e02c308d5f02074cbeb0202e3d994cd5fcb377fe7cfc0a66b1a8f058783609399685ac73280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragmaster"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(File::Temp) \
perl(Pod::Usage) \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-fragmaster-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
