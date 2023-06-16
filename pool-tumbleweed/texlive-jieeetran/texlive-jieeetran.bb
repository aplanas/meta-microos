SUMMARY = "UnofficiaL BibTeX style for citing Japanese articles in IEEE format"
DESCRIPTION = "This package provides an unofficial BibTeX style for authors \
trying to cite Japanese articles in the Institute of Electrical \
and Electronics Engineers (IEEE) format."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn65642"

RPM_NAME = "texlive-jieeetran-2023.201.0.0.19svn65642-55.1.noarch.rpm"
RPM_HASH = "65a0fed708c592cbc6f9d9f8ffd002d28dadbfd8c8bca65e0fda85380ccc564e585e2894ae7aa0158e82afd5ab2a28c55075cb9429bbe5d96815edd4b268a7f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jieeetran"

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
