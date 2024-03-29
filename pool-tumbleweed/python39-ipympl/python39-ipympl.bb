SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python39-ipympl-0.9.3-11.1.noarch.rpm"
RPM_HASH = "32ef377a2b208a5ccf7b4ca7c2b7ad1390dc6891f36bf6191270032ba01d5269f2590522ffcc61576856a4abbb578840f458211e43b3da1d1c7caf1289e4f71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipympl \
python39-ipympl \
python39-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9 \
-python39-matplotlib >= 3.4.0 with python39-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python39-Pillow \
python39-ipython \
python39-ipython-genutils \
python39-matplotlib-web \
python39-numpy \
python39-traitlets"

inherit rpm
