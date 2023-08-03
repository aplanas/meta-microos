SUMMARY = "Color separation"
DESCRIPTION = "Support for colour separation when using dvips."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn13293"

RPM_NAME = "texlive-colorsep-2023.209.svn13293-54.1.noarch.rpm"
RPM_HASH = "ffd13069a395caa91848f6ece19c9f0da870d68c11e9fd25fa457022e86f369192e367eca3db3bfdc24dec711acba70021cbcb167d45a8352c9ee55fe4aa1090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorsep"

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
