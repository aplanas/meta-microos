SUMMARY = "Persian (Farsi) introduction to LaTeX"
DESCRIPTION = "A Persian (Farsi) translation of Oetiker's (not so) short \
introduction."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.5.01svn31296"

RPM_NAME = "texlive-lshort-persian-2023.209.5.01svn31296-55.1.noarch.rpm"
RPM_HASH = "6182e65a445f8275a4911cc62fa893f1f81a7bf84ee379d446d9243295beb6fbf6a02bbaa9afe2d2bb6903d98884ce5491f4f937a8d71e23a7d3f335e74d838b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-persian"

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
