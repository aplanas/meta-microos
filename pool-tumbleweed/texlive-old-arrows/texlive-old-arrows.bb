SUMMARY = "Computer Modern old-style arrows with smaller arrowheads"
DESCRIPTION = "This package provides Computer Modern old-style arrows with \
smaller arrowheads, associated with the usual LaTeX commands. \
It can be used in documents that contain other amssymb arrow \
characters that also have small arrowheads. It is also possible \
to use the usual new-style Computer Modern arrows together with \
the old-style ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn42872"

RPM_NAME = "texlive-old-arrows-2023.209.2.0svn42872-55.1.noarch.rpm"
RPM_HASH = "1280dbaed379c08757f37f0e22ee04441a17760829bfcc38ee67d870b34534d23736d083e1aced4825f0344060ae9d91f105e5f1383e3165a2fa5499b34fb813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oabsy10.tfm \
tex-oabsy5.tfm \
tex-oabsy6.tfm \
tex-oabsy7.tfm \
tex-oabsy8.tfm \
tex-oabsy9.tfm \
tex-oasy.enc \
tex-oasy.map \
tex-oasy10.tfm \
tex-oasy5.tfm \
tex-oasy6.tfm \
tex-oasy7.tfm \
tex-oasy8.tfm \
tex-oasy9.tfm \
tex-old-arrows.sty \
texlive-old-arrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-old-arrows-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
