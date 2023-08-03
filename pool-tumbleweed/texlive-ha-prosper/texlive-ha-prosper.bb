SUMMARY = "Patches and improvements for prosper"
DESCRIPTION = "HA-prosper is a patch for prosper that adds new functionality \
to prosper based presentations. Among the new features you will \
find automatic generation of a table of contents on each slide, \
support for notes and portrait slides. The available styles \
demonstrate how to expand the functionality of prosper even \
further."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-2023.209.4.21svn59651-54.1.noarch.rpm"
RPM_HASH = "218e73b180e01eb58ac44cfd7f7a7bd1a045f873847cbf1561572df008151a08f6206c1d8e59735b10d9d85e0b620dadabe6b72da49003f24891a4767bca3a9e"
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
