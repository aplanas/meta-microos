SUMMARY = "Python clone of R's ggplot"
DESCRIPTION = "The ggplot package is a Python implementation of the grammar of \
graphics. It is not intended to be a feature-for-feature port of \
ggplot2 for R. There will be feature overlap, but not \
necessarily mimicry."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "python39-ggplot-0.11.5-3.11.noarch.rpm"
RPM_HASH = "bdfa21ecce73d916cd16b37a90c88d6c06488356e0ebaec2527a0f696d5d88e5a660267e34b5de45fa0a97302919017e78211f8b5e2796de545038ed9f8bf8e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ggplot) \
python39-ggplot \
python3dist(ggplot)"

RDEPENDS:${PN} += "python(abi) \
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
