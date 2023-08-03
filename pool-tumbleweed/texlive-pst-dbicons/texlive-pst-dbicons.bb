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

PV = "2023.209.0.0.16svn17556"

RPM_NAME = "texlive-pst-dbicons-2023.209.0.0.16svn17556-53.1.noarch.rpm"
RPM_HASH = "92b9e7a75a265a962c0090a797687edcf7ad0c184e1da8fd40fc261393c3bc0743be6c7fc9282a581cc8d48d0a8818632e6009f33e1c9a95e33498ff63a22bee"
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
