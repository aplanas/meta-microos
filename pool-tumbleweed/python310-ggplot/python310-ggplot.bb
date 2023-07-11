SUMMARY = "Python clone of R's ggplot"
DESCRIPTION = "The ggplot package is a Python implementation of the grammar of \
graphics. It is not intended to be a feature-for-feature port of \
ggplot2 for R. There will be feature overlap, but not \
necessarily mimicry."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "python310-ggplot-0.11.5-3.13.noarch.rpm"
RPM_HASH = "397bec94e0c68f95b65421e88d79114c7ece9ac83265bc8486e816a7ee7021654c883bcd0ddfad32ab653d9a83801c773c575cd26240e8e039bb48070a505b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ggplot \
python310-ggplot \
python3dist-ggplot"

RDEPENDS:${PN} += "python-abi \
python310-Cycler \
python310-brewer2mpl \
python310-matplotlib \
python310-numpy \
python310-pandas \
python310-patsy \
python310-scipy \
python310-six \
python310-statsmodels"

inherit rpm
