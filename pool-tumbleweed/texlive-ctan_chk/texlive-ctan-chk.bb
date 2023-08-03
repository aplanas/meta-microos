SUMMARY = "CTAN guidelines verifier and corrector for uploading projects"
DESCRIPTION = "Basic gawk program that uses CTAN's published guidelines for \
authors to help eliminate sloppiness in uploaded \
files/projects. It is completely open for users to program \
additional guidelines as well as CTAN's future adjustments."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn36304"

RPM_NAME = "texlive-ctan_chk-2023.209.1.0svn36304-55.1.noarch.rpm"
RPM_HASH = "8ea67240aa9dd356b88e8d1aba49e0189d1f00e00e164c563c8c13ad7e54e1804a69ee7f83f8a6811fcc5fcb72d523d454aaee80dcc448427ada5ff0a9c51bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctan-chk"

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
