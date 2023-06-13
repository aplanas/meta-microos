SUMMARY = "Symbols for multiobjective optimisation etcetera"
DESCRIPTION = "The package provides a series of operators commonly used in \
papers related to multiobjective optimisation, multiobjective \
evolutionary algorithms, multicriteria decision making and \
similar fields."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-multiobjective-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "82f2c1fa54dc4ee7a6ae8bd2a1c0549c89e18a9b0ca751017d1cbce44a0c6d82eac58cd086632ff89e3891a61e53a7da3ccd3f46e1ee7e8d6dc90ab413646076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multiobjective.sty) \
texlive-multiobjective"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
