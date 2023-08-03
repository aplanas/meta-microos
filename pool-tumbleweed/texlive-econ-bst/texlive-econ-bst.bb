SUMMARY = "BibTeX style for economics papers"
DESCRIPTION = "This is a BibTeX style file for papers in economics. It \
provides the following features: author-year type citation \
reference style used in economics papers highly customizable \
use of 'certified random order' as proposed by Ray Robson \
(2018)"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-2023.209.3.1.1svn61499-54.1.noarch.rpm"
RPM_HASH = "6c8f5b42452c4cb603b0d190b678881aa7fa9751379955bf876eea2bab8c47f333e28c80162a195197b06510d404c7646b0fffa1925660c92dfdd4759ce23069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst"

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
