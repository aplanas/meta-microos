SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python311-ipympl-0.9.3-11.1.noarch.rpm"
RPM_HASH = "906b9445e144ba8de6ea71447499016db6ca90d12d20c78f942c4370b7798d307fbe81f8f342728b76418837073d0994706f4d081cb6641b2a0bad5f63665ed2"
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
