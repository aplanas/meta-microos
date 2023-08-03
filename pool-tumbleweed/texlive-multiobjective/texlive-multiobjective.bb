SUMMARY = "Symbols for multiobjective optimisation etcetera"
DESCRIPTION = "The package provides a series of operators commonly used in \
papers related to multiobjective optimisation, multiobjective \
evolutionary algorithms, multicriteria decision making and \
similar fields."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-multiobjective-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "c3f92c2665573b8a7573138ea62783f7edfce45a3b243db74dad2e6a4d7dca2ffc379f639380d3371cc4d074acaf9cb8dd1907a6dae1c38f162a558a4d20e6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiobjective.sty \
texlive-multiobjective"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
