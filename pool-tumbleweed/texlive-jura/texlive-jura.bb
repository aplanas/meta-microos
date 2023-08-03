SUMMARY = "A document class for German legal texts"
DESCRIPTION = "Implements the standard layout for German term papers in law \
(one-and-half linespacing, 7 cm margins, etc.). Includes \
alphanum that permits alphanumeric section numbering (e.g., A. \
Introduction; III. International Law)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.3svn15878"

RPM_NAME = "texlive-jura-2023.209.4.3svn15878-56.1.noarch.rpm"
RPM_HASH = "9e51d78ea4dc1de1fcf1e3b0748869f2fbda72018be2a0c2157fb03ca8d67165f52087158b6f9260dea8b4d151838ad64ef282c497286040f60d1731253bc40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alphanum.sty \
tex-jura.cls \
texlive-jura"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
