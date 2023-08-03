SUMMARY = "Improved underlines in mathematics"
DESCRIPTION = "The package provides a (maths mode) \\underline variant which \
doesn't impose italics correction at the end."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-noitcrul-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "5e796fb8ac1aedc9859133c22e2f9953923e3b2c00c6da1eb6c766d2b6732f4f13fa415a4eb978a14637edfaeaf07a29a8ec3b888d13e6d7bf6c51f465fed6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noitcrul.sty \
texlive-noitcrul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-robustcommand.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
