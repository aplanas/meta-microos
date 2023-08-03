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

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-seqsplit-2023.209.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "fca3264b29580e6bc7dc6152986189d9b20b02eae3694c3fd80a6f48c9f1b659d7b8ed6e244e930019beb6df1aa44aae2bdc183697ea36622eb743396edd7d3c"
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
