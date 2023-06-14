SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python39-python-ternary-1.0.8-1.7.noarch.rpm"
RPM_HASH = "7078a0882a81e94ecfc9848622f46eadb7c690026a227502a998c8a4a5f9d2705a96a53c17d2681d6915bc8d6e30bfdc68ac64f2016beb62be8ebd08f317e9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-ternary \
python39-python-ternary \
python3dist-python-ternary"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib"

inherit rpm
