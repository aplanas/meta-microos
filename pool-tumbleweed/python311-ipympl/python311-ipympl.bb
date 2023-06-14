SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python311-ipympl-0.9.3-10.1.noarch.rpm"
RPM_HASH = "32bc11d848d839151683359099891009666a8817c3c49777208a67770be3fa07fad4bc15aa09cf2c4be38754d3c7f892e9129b63c6f36e2a1a97e6cc24327f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ipympl \
python311-ipympl \
python311-jupyter-ipympl \
python3dist-ipympl"

RDEPENDS:${PN} += "-python311-ipywidgets >= 7.6.0 with python311-ipywidgets < 9 \
-python311-matplotlib >= 3.4.0 with python311-matplotlib < 4 \
jupyter-matplotlib \
python-abi \
python311-Pillow \
python311-ipython \
python311-ipython-genutils \
python311-matplotlib-web \
python311-numpy \
python311-traitlets"

inherit rpm
