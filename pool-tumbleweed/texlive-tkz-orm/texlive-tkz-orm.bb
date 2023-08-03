SUMMARY = "Create Object-Role Model (ORM) diagrams"
DESCRIPTION = "The package provides styles for drawing Object-Role Model (ORM) \
diagrams in TeX based on the PGF and TikZ picture environment."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.4svn61719"

RPM_NAME = "texlive-tkz-orm-2023.209.0.0.1.4svn61719-53.1.noarch.rpm"
RPM_HASH = "b191ab75a18ebce10b1b973365ec14adcfc0c9dbcbd7c70f85edde46dc2af1e85263674efc16a621d7d323c16ddec73dc9918e233340b11f4f02a45c043eadfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-orm.sty \
texlive-tkz-orm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
