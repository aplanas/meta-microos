SUMMARY = "Typesetting linear programming formulations and sets of equations"
DESCRIPTION = "The package is designed to aid the author writing linear \
programming formulations, one restriction at a time. With the \
package, one can easily label equations, formulations can span \
multiple pages and several elements of the layout (such as \
spacing, texts and equation tags) are also customizable. \
Besides linear programming formulations, this package can also \
be used to display any series of aligned equations with easy \
labeling/referencing and other customization options."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36918"

RPM_NAME = "texlive-lpform-2023.209.svn36918-55.1.noarch.rpm"
RPM_HASH = "094d4a2817123a883bed525723e3bb3db7ab8705eebc6fa700c5693c89edb746c5e0682984596e260c21a0f18c88b738e3c9e9d796d1f9e913a3a8fa8b46db52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lpform.sty \
texlive-lpform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
