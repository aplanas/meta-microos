SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python39-ipympl-0.9.3-10.2.noarch.rpm"
RPM_HASH = "7e2a711d4f3a02eb402612c0048259d98020ad017e8817100afde9042f28cb10902a8139dfade67cac1cce52f612e154fe6838b978e9481c2754009a96c3450f"
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
