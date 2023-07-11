SUMMARY = "Python clone of R's ggplot"
DESCRIPTION = "The ggplot package is a Python implementation of the grammar of \
graphics. It is not intended to be a feature-for-feature port of \
ggplot2 for R. There will be feature overlap, but not \
necessarily mimicry."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "python39-ggplot-0.11.5-3.13.noarch.rpm"
RPM_HASH = "62916695b5f729bfed824eb279957f73a79340370d4d6ec222cc952242b777d0212792433c27f28b284181e0fe455c1955450bf6a3e7ffbf87bdd23a10a926d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ggplot \
python39-ggplot \
python3dist-ggplot"

RDEPENDS:${PN} += "python-abi \
python39-Cycler \
python39-brewer2mpl \
python39-matplotlib \
python39-numpy \
python39-pandas \
python39-patsy \
python39-scipy \
python39-six \
python39-statsmodels"

inherit rpm
