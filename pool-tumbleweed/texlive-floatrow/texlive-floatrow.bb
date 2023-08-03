SUMMARY = "Modifying the layout of floats"
DESCRIPTION = "The floatrow package provides many ways to customize layouts of \
floating environments and has code to cooperate with the \
caption 3.x package. The package offers mechanisms to put \
floats side by side, and to put the caption beside its float. \
The floatrow settings could be expanded to the floats created \
by packages rotating, wrapfig, subfig (in the case of rows of \
subfloats), and longtable."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3bsvn15878"

RPM_NAME = "texlive-floatrow-2023.209.0.0.3bsvn15878-53.1.noarch.rpm"
RPM_HASH = "6ad485864268060350aa635abc3b6c07a2ad00e6c9961c4e5dad18b8b89a859cb7e967690b84a756fee01ce2ed7b8fba53593d43e131164852f4a0783d801db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-floatpagestyle.sty \
tex-floatrow.sty \
tex-fr-fancy.sty \
tex-fr-longtable.sty \
tex-fr-subfig.sty \
tex-listpen.sty \
texlive-floatrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption3.sty \
tex-fancybox.sty \
tex-keyval.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
