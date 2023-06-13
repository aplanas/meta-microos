SUMMARY = "Finnish introduction to LaTeX"
DESCRIPTION = "This is the Finnish translation of Short Introduction to \
LaTeX2e, with added coverage of Finnish typesetting rules."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-lshort-finnish-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "b524ea0440b926ad7209f116dba035748b3971006ef18bf7fbb57325a7399198e32926cdc19c246ef0b355dfc4d7bf1c4fe17fb214f4bd1611e64a2a348e6f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-finnish"

RDEPENDS:${PN} += "/bin/sh \
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
