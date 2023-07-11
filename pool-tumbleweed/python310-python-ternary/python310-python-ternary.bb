SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python310-python-ternary-1.0.8-1.9.noarch.rpm"
RPM_HASH = "03cbbb186e7b532740f26d4209b784ab673ea76998790663ac9add6eaa66f06a2bc64ac12e47bdcb1f911c3fd3bcf138425fa9e5665976899beaf07eb0a5b686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-ternary \
python310-python-ternary \
python3dist-python-ternary"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib"

inherit rpm
