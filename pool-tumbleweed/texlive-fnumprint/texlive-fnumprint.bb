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

PV = "2023.201.1.1asvn29173"

RPM_NAME = "texlive-fnumprint-2023.201.1.1asvn29173-52.1.noarch.rpm"
RPM_HASH = "b1cc3d2e15f757922d066e82d9573bca97e67542ed9ac40c9f69375d4812d64ac06842fd41bef977e1b133646ee1f50112acbec5ffbdbb66d83ce2405060c794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fnumprint.sty) \
texlive-fnumprint"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(numprint.sty) \
tex(xifthen.sty) \
tex(zahl2string.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
