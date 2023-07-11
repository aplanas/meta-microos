SUMMARY = "BibTeX style for economics papers"
DESCRIPTION = "This is a BibTeX style file for papers in economics. It \
provides the following features: author-year type citation \
reference style used in economics papers highly customizable \
use of 'certified random order' as proposed by Ray Robson \
(2018)"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-2023.201.3.1.1svn61499-53.2.noarch.rpm"
RPM_HASH = "1b8c4a679a253b3b8fbdd4533f065de10f60b7526754e792b688f54cb1ebf619de4c847e82c0f6d79decb0d37d3dd81085be7ff20e394399e944317d53db2317"
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
