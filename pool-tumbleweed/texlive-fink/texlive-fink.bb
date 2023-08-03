SUMMARY = "The LaTeX2e File Name Keeper"
DESCRIPTION = "This package 'looks over your shoulder' and keeps track of \
files \\input'ed (the LaTeX way) or \\include'ed in your \
document. You then have permanent access to the name of the \
file currently being processed through the macro \\finkfile. \
FiNK also comes with support for AUC-TeX. As of version 2.2.1, \
FiNK has been deprecated and is not maintained anymore. People \
interested in FiNK's functionality are invited to use a package \
named currfile instead."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn24329"

RPM_NAME = "texlive-fink-2023.209.2.2.1svn24329-53.1.noarch.rpm"
RPM_HASH = "837197682cf58d2ea4b4651becc207439998044374b613ad9d56262a08f8778f3a0b32944187468339eaf7c48b567dce47289d1ed30c5ae219bc203bf2313d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fink.sty \
texlive-fink"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
