SUMMARY = "Macros for typesetting math faster and more simply"
DESCRIPTION = "The physics2 package defines commands for typesetting math \
formulae faster andmore simply. physics2 is a modularized \
package, each module provides its own function. You can load \
modules separately after loading `physics2`. Modules of physics \
provide the following supports: Automatic braces; Dirac bra-ket \
notation; Easy way to typeset diagonal matrices and matrices \
with similar entries; Double cross and double dot (binary) \
operators for tensors."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn66115"

RPM_NAME = "texlive-physics2-2023.209.0.0.1.1svn66115-52.1.noarch.rpm"
RPM_HASH = "36289d79be19cac82286f0dda3d6dfd8536058769b0380d1575d0c88acdac356e81277275d9987473e622b2ed815d8451ee9b2887b89cc0f18f2366fe727242c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phy-ab.braket.sty \
tex-phy-ab.legacy.sty \
tex-phy-ab.sty \
tex-phy-bm-um.legacy.sty \
tex-phy-braket.sty \
tex-phy-common.sty \
tex-phy-diagmat.sty \
tex-phy-doubleprod.sty \
tex-phy-explsetup.sty \
tex-phy-nabla.legacy.sty \
tex-phy-op.legacy.sty \
tex-phy-qtext.legacy.sty \
tex-phy-xmat.sty \
tex-physics2.sty \
texlive-physics2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amstext.sty \
tex-fixdif.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
