SUMMARY = "Split long sequences of characters in a neutral way"
DESCRIPTION = "When one needs to type long sequences of letters (such as in \
base-sequences in genes) or of numbers (such as calculations of \
transcendental numbers), there's no obvious break points to be \
found. The package provides a command \\seqsplit, which makes \
its argument splittable anywhere, and then leaves the TeX \
paragraph-maker to do the splitting. While the package may \
obviously be used to typeset DNA sequences, the user may \
consider the dnaseq as a rather more powerful alternative."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-seqsplit-2023.201.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "d94191fd9ef84b592fc4dc9bba0cc1e60710d507ccaa3112fecd47c920498871c1ebb62fdef5c51b74040bdba3be853477a4d42c04cd7bd7c7bcba15876d2e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seqsplit.sty \
texlive-seqsplit"

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
