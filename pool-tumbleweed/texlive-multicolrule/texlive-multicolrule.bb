SUMMARY = "Decorative rules between columns"
DESCRIPTION = "This package lets you customize the appearance of the vertical \
rule that appears between columns of multicolumn text. It is \
primarily intended to work with the multicol package, hence its \
name, but also supports the twocolumn option and \\twocolumn \
macro provided by the standard classes (and related classes \
such as the KOMA-Script equivalents). The package depends on \
expl3 and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn56366"

RPM_NAME = "texlive-multicolrule-2023.209.1.3asvn56366-55.1.noarch.rpm"
RPM_HASH = "1f49abd01b6c974edd60a754401b20ebec59f754a10cdbe8fd565b7155892bd7f905d47d10d5f4f418a138b6a45e988e2bdec0207c6e1fbf891321907fb5bacf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multicolrule.sty \
texlive-multicolrule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-multicol.sty \
tex-scrlfile.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
