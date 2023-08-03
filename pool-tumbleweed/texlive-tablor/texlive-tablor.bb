SUMMARY = "Create tables of signs and of variations"
DESCRIPTION = "The package allows the user to use the computer algebra system \
XCAS to generate tables of signs and of variations (the actual \
plotting of the tables uses the MetaPost macro package \
tableauVariations). Tables with forbidden regions may be \
developed using the package. A configuration file permits some \
configuration of the language to be used in the diagrams. The \
tablor package requires that shell escape be enabled."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.07_gsvn31855"

RPM_NAME = "texlive-tablor-2023.209.4.07_gsvn31855-55.1.noarch.rpm"
RPM_HASH = "c67f62851e8c8a227c83b816f271b4d0b469373e3e256b773eed677c8da55b12f42643cd3635e20eb39103eea6ef84fa01bb265041ef27b40d7a80cc091d6f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablor-xetex.sty \
tex-tablor.cfg \
tex-tablor.sty \
texlive-tablor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fancyvrb.sty \
tex-filecontents.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-pst-eps.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
