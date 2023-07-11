SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python311-python-ternary-1.0.8-1.9.noarch.rpm"
RPM_HASH = "5429196d77410620452a00bb6c22ab0408ed0c36fbc0e86ef12a1c24a8acc89d62e9865cddaff5cff1bd2b8ea56d5d8b3e767fa4281ac4d1371dc56fe630dfe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-ternary \
python3.11dist-python-ternary \
python311-python-ternary \
python3dist-python-ternary"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib"

inherit rpm
