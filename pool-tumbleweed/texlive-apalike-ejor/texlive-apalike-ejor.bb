SUMMARY = "A BibTeX style file for the European Journal of Operational Research"
DESCRIPTION = "This package contains a BibTeX style file, apalike-ejor.bst, \
made to follow the European Journal of Operational Research \
reference style guidelines. It is a fork of apalike version \
0.99a, by Oren Patashnik, and consists of minor modifications \
of standard APA style. Among other changes it adds support for \
hyperlinked URL and DOI fields (which requires hyperref)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn59667"

RPM_NAME = "texlive-apalike-ejor-2023.209.1.2.0svn59667-55.1.noarch.rpm"
RPM_HASH = "8dbb069416db8f002be38c2eaff5d645d89f3bdccd94f1e92b95cbaa0244acd4b283c7263f6fd5bb7dfb2e58cc4f40be6d31fd7efd55ee8df20334ce4b2dc89f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-ejor"

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
