SUMMARY = "Dirac bra-ket and set notations"
DESCRIPTION = "Provides macros to typeset bra-ket notation, as well as set \
specifiers, with a single ('|') or a double ('||' or ('\\|') \
vertical bar specifier in between two bracketed parts. Each \
macro comes in a fixed-size version and an expanding version. \
If the package finds itself operating under e-tex, it uses the \
extended primitive \\middle for more reliable results"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17127"

RPM_NAME = "texlive-braket-2023.201.svn17127-52.1.noarch.rpm"
RPM_HASH = "591709e72601ec4200317bfbab3094d886c3ab0c536276e96262e28d1a179160167afff955558815f249999150947aa2f93ec1b8ee93b324d369fe7a3d86e898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(braket.sty) \
texlive-braket"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
