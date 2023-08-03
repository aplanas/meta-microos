SUMMARY = "Support for Concrete text and math fonts in LaTeX"
DESCRIPTION = "LaTeX font definition files for the Concrete fonts and a LaTeX \
package for typesetting documents using Concrete as the default \
font family. The files support OT1, T1, TS1, and Concrete \
mathematics including AMS fonts (Ulrik Vieth's concmath)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61431"

RPM_NAME = "texlive-ccfonts-2023.209.svn61431-53.1.noarch.rpm"
RPM_HASH = "57aff675eb47d7870d2685f8aa292ba953181fb3fbb6e6b09589f13c8022168334e05ca0c94366827ab3bbd2bcb644aa99c4104ca3d566c39286c332d738cd08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ccfonts.sty \
tex-t1ccr.fd \
tex-ts1ccr.fd \
texlive-ccfonts"

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
