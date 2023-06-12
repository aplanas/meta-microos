SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python310-python-ternary-1.0.8-1.7.noarch.rpm"
RPM_HASH = "1fe1e6061f8ee1966a0d2ed76151a17708cb85e2cc8abf6d6a10c24adb99a7bbd709d14d6eb19f70166e7b2536a6201d86445ba7e5878476156d8bcd1e151c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-ternary \
python3.10dist(python-ternary) \
python310-python-ternary \
python3dist(python-ternary)"
RDEPENDS:${PN} += "python(abi) \
python310-matplotlib"

inherit rpm
