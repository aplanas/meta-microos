SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "python310-jupyterlab-widgets-3.0.7-1.3.noarch.rpm"
RPM_HASH = "da3062222739d3e5751dd52054a062f160e69d39d60d15d822fd5143b367b2ed5181edebf1f9c3545ba36e1803087bbc711006c93906fc36b464fa05bd43888a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab-widgets \
python310-jupyterlab-widgets \
python3dist-jupyterlab-widgets"

RDEPENDS:${PN} += "jupyter-jupyterlab-widgets \
python-abi"

inherit rpm
