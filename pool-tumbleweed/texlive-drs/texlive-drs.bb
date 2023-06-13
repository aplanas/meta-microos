SUMMARY = "Typeset Discourse Representation Structures (DRS)"
DESCRIPTION = "The package draws Discourse Representation Structures (DRSs). \
It can draw embedded DRSs, if-then conditions and \
quantificational 'duplex conditions' (with a properly scaled \
connecting diamond). Formatting parameters allow the user to \
control the appearance and placement of DRSs, and of DRS \
variables and conditions. The package is based on DRS macros in \
the covington package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn19232"

RPM_NAME = "texlive-drs-2023.201.1.1bsvn19232-52.1.noarch.rpm"
RPM_HASH = "f3e12a27e363389c5de360af54cb851009f89fca118024f2035b0d9566f9eec8aa94f925173e18cefc1c7726d8e3b57061770bcf5181900c36f50f31ec3fd721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(drs.sty) \
texlive-drs"

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
