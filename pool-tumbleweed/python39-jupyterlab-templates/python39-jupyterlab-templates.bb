SUMMARY = "Templates for notebooks in JupyterLab"
DESCRIPTION = "Support for jupyter notebook templates in jupyterlab."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-jupyterlab-templates-0.4.0-1.1.noarch.rpm"
RPM_HASH = "864a485e7d5612cd66429e3486a8002ae467f4d4f5124ca40f29e7f63f54273f84be115832fb104ce650e80a40e534fcab882ee572e3c5cf2f7bf12593336485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyterlab-templates) \
python39-jupyter_jupyterlab_templates \
python39-jupyterlab-templates \
python3dist(jupyterlab-templates)"
RDEPENDS:${PN} += "jupyter-jupyterlab-templates \
python(abi) \
python39-jupyterlab"

inherit rpm
