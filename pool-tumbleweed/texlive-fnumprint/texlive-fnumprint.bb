SUMMARY = "Print a number in 'appropriate' format"
DESCRIPTION = "The package defines two macros which decide to typeset a number \
either as an Arabic number or as a word (or words) for the \
number. If the number is between zero and twelve (including \
zero and twelve) then words will be used; if the number is \
outside that range, it will be typeset using the package \
numprint Words for English representation of numbers are \
generated within the package, while those for German are \
generated using the package zahl2string."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn29173"

RPM_NAME = "texlive-fnumprint-2023.209.1.1asvn29173-53.1.noarch.rpm"
RPM_HASH = "d88e33ddcd1c1191ba67a383c65aa4783a54dff4385f80a3d8467381e6d6fc19581e5e75f6f4ddb56a675d59ee1f934a9db50f416c00299370b1d488f596b509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnumprint.sty \
texlive-fnumprint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numprint.sty \
tex-xifthen.sty \
tex-zahl2string.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
