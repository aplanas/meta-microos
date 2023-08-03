SUMMARY = "Customisation of cross-references in LaTeX"
DESCRIPTION = "The package contains macros which allow authors to easily \
customise how cross-references appear in their document, both \
in general (across all cross-references) and for particular \
types of references (identified by a prefix in the reference \
label), in a very generic manner."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-modref-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "65828e307c9194cbd86d4c3a8b3b046d8c256c2adb3fb65cfe7dc9505fa5cf543765c01e6f025393168c08705345f18b524010373555a295badf59891b574f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modref.sty \
texlive-modref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
