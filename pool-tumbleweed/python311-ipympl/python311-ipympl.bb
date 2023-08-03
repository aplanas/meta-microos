SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python311-ipympl-0.9.3-10.3.noarch.rpm"
RPM_HASH = "c24f50cef0894a4dab020e321e82b51228bea2bfa83a1323d1afd7a84e0d6865342ce6afc090b4f6c355bfb7e0742bb2a703f80bab5593a044b2ee692a38443f"
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
