SUMMARY = "German language module for glossaries package"
DESCRIPTION = "German language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "98f3aace50753a6f8bbd82174fd80ece9f24d47a7e21ffd4d98c1e72ac22b5cb11ca606f1441a07ea0f1f00e49c0bb4bba367aed49abb53b12fa4848c29e452f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-german.ldf \
texlive-glossaries-german"

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
