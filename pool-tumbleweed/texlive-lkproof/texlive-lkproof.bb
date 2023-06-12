SUMMARY = "LK Proof figure macros"
DESCRIPTION = "The package defines a pair of commands \\infer and \\deduce, that \
are used in constructing LK proof diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1svn20021"

RPM_NAME = "texlive-lkproof-2023.201.3.1svn20021-54.1.noarch.rpm"
RPM_HASH = "3258aa78f1124162b0e9c6de2f7fb519bc6e3c939395cd506f483960f5d811ea2515002fcf0d2212aba472b7b217a541b1986b3b10077c7178328c3682826bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(proof.sty) \
texlive-lkproof"
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
