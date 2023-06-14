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

PV = "2023.201.2.2.1svn24329"

RPM_NAME = "texlive-fink-2023.201.2.2.1svn24329-52.1.noarch.rpm"
RPM_HASH = "0b12bb974aac1c3f9f8a37acb31d03ee0bea774d48d3111b27b2326d50f4812ad60e938e3b0e3b46ff34fdcbc74ab6a8b5cd774345ac8f04b67cf5d76a8486d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fink.sty \
texlive-fink"

RDEPENDS:${PN} += "/bin/sh \
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
