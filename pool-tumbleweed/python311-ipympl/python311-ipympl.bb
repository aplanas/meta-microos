SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python311-ipympl-0.9.3-10.2.noarch.rpm"
RPM_HASH = "9940a187dfbbd56c62328a8b7ef59a8241bde9685b54def652dbea33fbfd169acd065e9eb879addb5237f64f47b8ffaef055adb8b4a5dc8691503e14f52d0a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipympl \
python3-jupyter-ipympl \
python3.11dist-ipympl \
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
