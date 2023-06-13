SUMMARY = "Composable style cycles"
DESCRIPTION = "When plotting more than one line it is common to want to be able to \
cycle over one or more artist styles. For simple cases than can be \
done with out too much trouble. \
 \
However, if you want to do something more complicated, the plotting \
logic can quickly become very involved. To address this and allow \
easy cycling over arbitrary kwargs the Cycler class, a composable \
kwarg iterator, was developed."
LICENSE = "BSD-3-Clause"

PV = "0.11.0"

RPM_NAME = "python310-Cycler-0.11.0-2.1.noarch.rpm"
RPM_HASH = "8f60376c18220662733c6dc62200d752e09e5a257e24aed9fa069c5a7f232fd23a2b6cddce768e14e02c3e2bf38fcc7223bb4535894efe87630be1799dc72506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cycler \
python3.10dist(cycler) \
python310-Cycler \
python3dist(cycler)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
