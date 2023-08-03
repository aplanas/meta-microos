SUMMARY = "Finnish introduction to LaTeX"
DESCRIPTION = "This is the Finnish translation of Short Introduction to \
LaTeX2e, with added coverage of Finnish typesetting rules."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-lshort-finnish-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "d92704ddcbad3b7d9448608c2f05e04865ad349365a4d12bbc35efe35aba830930f6c3243fe218927e3a539fab499904b921cd8f60cff4553d9bd688a4987e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-finnish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
