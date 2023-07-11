SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python39-python-ternary-1.0.8-1.9.noarch.rpm"
RPM_HASH = "f694dcf0772800e02bc88031a3d7a9a3f480277078a796cd60e59285fe3ed70afb552bf4ddbe98c55493df55aca4491313d28ea5e5446545d5a2a4f4b4b21a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-ternary \
python39-python-ternary \
python3dist-python-ternary"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib"

inherit rpm
