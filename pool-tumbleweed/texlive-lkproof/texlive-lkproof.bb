SUMMARY = "LK Proof figure macros"
DESCRIPTION = "The package defines a pair of commands \\infer and \\deduce, that \
are used in constructing LK proof diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1svn20021"

RPM_NAME = "texlive-lkproof-2023.209.3.1svn20021-55.1.noarch.rpm"
RPM_HASH = "4797b9450b144a32a57f5f0bf28340decd71b2a3e3da236e6427110ba2c1a363384e8e16137622b954167548d207b2a7631bd831170c936353b14dd50ac6e18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proof.sty \
texlive-lkproof"

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
