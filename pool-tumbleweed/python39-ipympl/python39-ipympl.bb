SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python39-ipympl-0.9.3-10.3.noarch.rpm"
RPM_HASH = "487d5b5987462ce146746b0c727bab51946a5fbe93c1dba768c804bbf81bc72f5da2303d3a9f354d2120dc1622ce80a8456a34afcb54869287ba38db74355b46"
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
