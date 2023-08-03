SUMMARY = "German version of A Short Introduction to LaTeX2e: LaTeX2e-Kurzbeschreibung"
DESCRIPTION = "The lshort-german package"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0csvn55643"

RPM_NAME = "texlive-lshort-german-2023.209.3.0csvn55643-55.1.noarch.rpm"
RPM_HASH = "bc433e781e51e7da6c873ee1f15da67dabd8f2efae9236f766c251a9c31172698cbbbbb67e85b2a92da5b752c96ddc393b2e8ce6bf148d7fec6645663d189d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-german"

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
