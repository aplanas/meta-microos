SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python310-ipympl-0.9.3-11.1.noarch.rpm"
RPM_HASH = "0bdec2437ec431eae6b47f73814591fa50c4a81a809c4f12f99c4d732dcbcdf65f0ec688674b000dd00a8e0e939b8683e4f2946338fd0b3fd524ab793c482bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ipympl \
python310-ipympl \
python310-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9 \
-python310-matplotlib >= 3.4.0 with python310-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python310-Pillow \
python310-ipython \
python310-ipython-genutils \
python310-matplotlib-web \
python310-numpy \
python310-traitlets"

inherit rpm
