SUMMARY = "Support for users in Telecommunications Engineering"
DESCRIPTION = "The package provides a wide range of abbreviations for terms \
used in Telecommunications Engineering."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn28571"

RPM_NAME = "texlive-engtlc-2023.201.3.2svn28571-53.1.noarch.rpm"
RPM_HASH = "43b83a797aa02e9fd24e775f50165f9d2916d848a3c3c59b71ba3885e3234ce254e60baedc7d81551163e3df6405fa1f0555ed36a4416d34a0ccd6511b56183d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engtlc.sty \
texlive-engtlc"

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
