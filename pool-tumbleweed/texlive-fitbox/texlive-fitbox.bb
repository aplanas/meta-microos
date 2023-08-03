SUMMARY = "Fit graphics on a page"
DESCRIPTION = "The package allows a box (usually an \\includegraphics box) to \
fit on the page. It scales the box to the maximal allowed size \
within the user-set limits. If there is not enough space on the \
page, the box is moved to the next one."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn50088"

RPM_NAME = "texlive-fitbox-2023.209.1.02svn50088-53.1.noarch.rpm"
RPM_HASH = "9f6d36ac0e7000932c1ef0550e2a764d76020bd2b221e0d11f932554e6d8b2ba6b16f667b9fe4fc5a136531e2b5ef279061dac64d74a7d8090fbb0a8d88b6b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fitbox.sty \
texlive-fitbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
