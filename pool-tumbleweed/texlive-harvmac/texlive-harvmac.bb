SUMMARY = "Macros for scientific articles"
DESCRIPTION = "Known as 'Harvard macros', since written at that University."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harvmac-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "8a2feace748d27ccb2032c6bb7f7edda9eef8123ffbb84d2c587b6f100afb542e019aa73ca4abf4b2ed28dd0368630745d68adcd6c585b2a392da867800d34bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(harvmac.tex) \
texlive-harvmac"
RDEPENDS:${PN} += "/bin/sh \
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
