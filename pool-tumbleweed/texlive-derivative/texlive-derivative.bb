SUMMARY = "Nice and easy derivatives"
DESCRIPTION = "Typesetting derivatives and differentials in a consistent way \
are clumsy and require care to ensure the preferred formatting. \
Several packages have been developed for this purpose, each \
with its own features and drawbacks, with the most ambitious \
one being diffcoeff. While this package is comparable to \
diffcoeff in terms of features, it takes a different approach. \
One difference is this package provides more options to tweak \
the format of the derivatives and differentials. However, the \
automatic calculation of the total order isn't as developed as \
the one in diffcoeff. This package makes it easy to write \
derivatives and differentials consistently with its predefined \
commands. It also provides a set of commands that can define \
custom derivatives and differential operators. The options \
follow a consistent naming scheme making them easy to use and \
understand."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn63850"

RPM_NAME = "texlive-derivative-2023.201.1.2svn63850-52.1.noarch.rpm"
RPM_HASH = "dc86caaa9f0e555a2d2eff9b203dfdbfeb5b00f639c70474eb6097349b65ed4ea8b082f8013bf46f543b094a00dc8bd06694928012ec717358c350c5d0637c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(derivative.sty) \
texlive-derivative"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
