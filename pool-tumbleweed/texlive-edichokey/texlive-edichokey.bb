SUMMARY = "Typeset dichotomous identification keys"
DESCRIPTION = "This is a LaTeX package for typesetting dichotomous \
identification key in indented style. It can be considered as \
an extended version of package dichokey, as edichokey is more \
capable of dealing with complex keys."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-2023.201.2.01ysvn56223-53.1.noarch.rpm"
RPM_HASH = "c8856819360e1ecd1628c8494c68383554d8924126ddc7dd34a3dcbca8fdedd3b3d7274bb628027e2f3a0627b00042cb8fb7a4af1c0d0ac54ebcb8013f1369dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(edichokey.sty) \
texlive-edichokey"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
