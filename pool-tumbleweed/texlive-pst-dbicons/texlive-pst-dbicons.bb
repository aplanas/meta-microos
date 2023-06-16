SUMMARY = "Support for drawing ER diagrams"
DESCRIPTION = "The package provides some useful macros in the database area. \
The package focusses on typesetting ER-Diagrams in a \
declarative style, i.e., by positioning some nodes and defining \
the position of all other nodes relative to them by using the \
standard database terminology. The PSTricks package is required \
for using pst-dbicons, but no deep knowledge of PSTricks \
commands is required (although such knowledge is useful for \
exploiting the full functionality of the package)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.16svn17556"

RPM_NAME = "texlive-pst-dbicons-2023.201.0.0.16svn17556-52.1.noarch.rpm"
RPM_HASH = "b9f4fa2decd477d49ff59ffc8f4f0a7f063a0abf80640e956387d4d09e88ecd0e494f30c02db56a3b6f547c2c08cca461468ea4da055ec78356e15ad8004edd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-dbicons.sty \
texlive-pst-dbicons"

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
