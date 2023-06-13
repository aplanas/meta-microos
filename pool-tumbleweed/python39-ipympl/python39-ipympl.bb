SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python39-ipympl-0.9.3-10.1.noarch.rpm"
RPM_HASH = "2d015b9db871905c1eca5c1b41ceb0589f2c079ae86aea4ce7d81f1acb0bc8a9db12f1d75416bbc52c52d9dea9bbd590a10f13814955355cac4cd086384c4602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipympl) \
python39-ipympl \
python39-jupyter_ipympl \
python3dist(ipympl)"

RDEPENDS:${PN} += "(python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9) \
(python39-matplotlib >= 3.4.0 with python39-matplotlib < 4) \
jupyter-matplotlib \
python(abi) \
python39-Pillow \
python39-ipython \
python39-ipython_genutils \
python39-matplotlib-web \
python39-numpy \
python39-traitlets"

inherit rpm
