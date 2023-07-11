SUMMARY = "Python clone of R's ggplot"
DESCRIPTION = "The ggplot package is a Python implementation of the grammar of \
graphics. It is not intended to be a feature-for-feature port of \
ggplot2 for R. There will be feature overlap, but not \
necessarily mimicry."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "python311-ggplot-0.11.5-3.13.noarch.rpm"
RPM_HASH = "36eadb71b5505a582fed110e5092b44f1f15c57904b7c0ffe40dd2c2cd4d96156fdffbd651175387e026defabb6227a96258645af965684d730a4bc42653efa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ggplot \
python3.11dist-ggplot \
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
