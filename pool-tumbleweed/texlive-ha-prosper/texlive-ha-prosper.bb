SUMMARY = "Patches and improvements for prosper"
DESCRIPTION = "HA-prosper is a patch for prosper that adds new functionality \
to prosper based presentations. Among the new features you will \
find automatic generation of a table of contents on each slide, \
support for notes and portrait slides. The available styles \
demonstrate how to expand the functionality of prosper even \
further."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-2023.201.4.21svn59651-53.2.noarch.rpm"
RPM_HASH = "3af69dbbd10292289a822ce68ecf4854cd83277c93d4a9fc2cd8f4d2bc2d6e847f3058aa93d0218544e4e72202031c13e386c9ce2eaf142a5ed26b1d390c636a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-HA-prosper.cfg \
tex-HA-prosper.sty \
tex-HAPAggie.sty \
tex-HAPFyma.sty \
tex-HAPHA.sty \
tex-HAPLakar.sty \
tex-HAPTCS.sty \
tex-HAPTCSTealBlue.sty \
tex-HAPTCSgrad.sty \
tex-HAPTycja.sty \
tex-HAPcapsules.sty \
tex-HAPciment.sty \
tex-HAPsimple.sty \
texlive-ha-prosper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-mathpazo.sty \
tex-multido.sty \
tex-palatino.sty \
tex-pifont.sty \
tex-pst-grad.sty \
tex-pst-slpe.sty \
tex-semhelv.sty \
tex-verbatim.sty \
tex-xcomment.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
