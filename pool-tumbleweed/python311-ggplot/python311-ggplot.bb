SUMMARY = "Python clone of R's ggplot"
DESCRIPTION = "The ggplot package is a Python implementation of the grammar of \
graphics. It is not intended to be a feature-for-feature port of \
ggplot2 for R. There will be feature overlap, but not \
necessarily mimicry."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "python311-ggplot-0.11.5-3.11.noarch.rpm"
RPM_HASH = "4f11a83de4e9f059adf58f5899f6bafbfb9225a233372503caac1943b30d9c62e3bb22f88bd5564c2861d4c62a5563d540b60421f0cc0646f7ec5046c1e0b1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ggplot \
python311-ggplot \
python3dist-ggplot"

RDEPENDS:${PN} += "python-abi \
python311-Cycler \
python311-brewer2mpl \
python311-matplotlib \
python311-numpy \
python311-pandas \
python311-patsy \
python311-scipy \
python311-six \
python311-statsmodels"

inherit rpm
