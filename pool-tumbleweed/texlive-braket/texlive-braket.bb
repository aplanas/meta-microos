SUMMARY = "Dirac bra-ket and set notations"
DESCRIPTION = "Provides macros to typeset bra-ket notation, as well as set \
specifiers, with a single ('|') or a double ('||' or ('\\|') \
vertical bar specifier in between two bracketed parts. Each \
macro comes in a fixed-size version and an expanding version. \
If the package finds itself operating under e-tex, it uses the \
extended primitive \\middle for more reliable results"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17127"

RPM_NAME = "texlive-braket-2023.209.svn17127-53.1.noarch.rpm"
RPM_HASH = "bc0611982dec55409334c4e057df6c818ad2cba7d7f3906aa7926e6e7be59df1e2cb92b6d96a7a3f529122e47ecc67d96af05390e7f44e653920cc14bd25b42c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-braket.sty \
texlive-braket"

RDEPENDS:${PN} += "/usr/bin/sh \
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
